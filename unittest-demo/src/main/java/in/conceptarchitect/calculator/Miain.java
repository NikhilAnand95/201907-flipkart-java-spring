package in.conceptarchitect.calculator;

import java.io.Console;

public class Miain {

    public static void main(String []args){
        DataProvider provider=new ConsoleDataProvider();

        AdvancedCalculator calc=new AdvancedCalculator();

        int result=calc.Plus(provider);
        System.out.println(result);

    }
}
