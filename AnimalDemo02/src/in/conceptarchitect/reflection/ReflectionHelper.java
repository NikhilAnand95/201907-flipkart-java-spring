package in.conceptarchitect.reflection;

import in.conceptarchitect.animals.SpecialBehavior;
import in.conceptarchitect.animals.Speciality;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionHelper {

    public static void showInfo(Class cls){
        System.out.println("Name:"+cls.getName());
        System.out.println("Simple Name:"+cls.getSimpleName());
        System.out.println("Package:"+cls.getPackageName());
        System.out.println("SuperClass:"+cls.getSuperclass().getName());

        Class [] interfaces= cls.getInterfaces();
        if (interfaces.length>0)
        {
            System.out.println("Interfaces");
            for(Class inf :interfaces)
                System.out.println("\t"+inf.getName());
        }

        System.out.println("Methods");
        for(Method method : cls.getMethods())
            System.out.println("\t"+method.getName());

    }


    public static void useObject(Class cls){
        Object obj=null;
        try {
            obj = cls.newInstance();
        }catch(Exception ex){
            throw new RuntimeException(ex.getMessage(),ex.getCause());
        }

        for(Method method: cls.getMethods()){
            int m=method.getModifiers();
            if(Modifier.isStatic(m))
                continue;
            if(method.getDeclaringClass().equals(Object.class))
                continue;

            if(method.getParameterCount()>0) {
                System.out.println("Ignoring "+method.getName());
                continue;
            }
            try {
                System.out.println("invoking "+cls.getSimpleName()+"."+method.getName());
                method.invoke(obj);

            }catch(Exception ex){
                System.out.println("Error:"+ex+":"+ex.getMessage());
            }
            System.out.println();
        }


    }


    public static Object invokeSafe(Object o, String methodName, Object ...arg){
        try{
            Method m= o.getClass().getMethod(methodName);
            return m.invoke(o,arg);
        }catch(Exception ex){
            System.out.println(methodName+" not found in "+o.getClass().getSimpleName());
            return null;
        }
    }

    public static void useSpeciality(Class cls){
        Object obj=null;
        try {
            obj = cls.newInstance();
        }catch(Exception ex){
            throw new RuntimeException(ex.getMessage(),ex.getCause());
        }
        int count=0;
        for(Method method: cls.getMethods()){
            int m=method.getModifiers();
            if(Modifier.isStatic(m))
                continue;
            if(method.getDeclaringClass().equals(Object.class))
                continue;

            if(method.getParameterCount()>0) {
                //System.out.println("Ignoring "+method.getName());
                continue;
            }

            if(method.getDeclaredAnnotation(Speciality.class)==null){
                //System.out.println("Ignoring "+method.getName());
                continue;
            }

            try {
                count++;
                System.out.println("invoking "+cls.getSimpleName()+"."+method.getName());
                method.invoke(obj);

            }catch(Exception ex){
                System.out.println("Error:"+ex+":"+ex.getMessage());
            }
            System.out.println();


        }

        if(count==0){
            System.out.println(cls.getSimpleName()+" has no speciality");
        }


    }

    public static void useSpecialBehavior(Class cls){
        Method method=null;
        SpecialBehavior sb=(SpecialBehavior) cls.getDeclaredAnnotation(SpecialBehavior.class);
        if(sb==null)
            return;

        String methodName=sb.name();
        try{
            invokeSafe(cls.newInstance(),methodName);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }



    }
}
