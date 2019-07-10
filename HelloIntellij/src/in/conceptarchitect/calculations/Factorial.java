package in.conceptarchitect.calculations;

public class Factorial {

    public static int calcuate(int n){
        int fn=1;
        while (n>1)
            fn*=n--;

        return fn;
    }

}
