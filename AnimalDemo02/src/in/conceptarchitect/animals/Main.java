package in.conceptarchitect.animals;

import in.conceptarchitect.reflection.ReflectionHelper;

public class Main {

    public static void main(String []args) throws ClassNotFoundException {

        //demo01();
        String className=Input.readString("class name?");

        if(!className.contains("."))
            className="in.conceptarchitect.animals."+className;

        Class cls=Class.forName(className);
        //ReflectionHelper.useSpeciality(cls);

        ReflectionHelper.useSpecialBehavior(cls);



        //ReflectionHelper.showInfo(cls);

        //ReflectionHelper.useObject(cls);

        //invokeSafeTest(tiger, horse);
    }

    private static void invokeSafeTest() {
        Tiger tiger=new Tiger();
        Horse horse=new Horse();

        ReflectionHelper.invokeSafe(tiger,"hunt"); //will be caleld

        ReflectionHelper.invokeSafe(horse,"hunt"); //will not be invoked

        ReflectionHelper.invokeSafe(tiger,"ride"); //will be caleld

        ReflectionHelper.invokeSafe(horse,"ride"); //will not be invoked
    }

    private static void demo01() {
        Tiger tiger=new Tiger();

        Class c1=Tiger.class;
        Class c2=tiger.getClass();
        //ReflectionHelper.showInfo(c1);
        ReflectionHelper.showInfo(Horse.class);
    }
}
