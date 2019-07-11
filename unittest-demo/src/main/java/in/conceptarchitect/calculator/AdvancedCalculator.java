package in.conceptarchitect.calculator;

public class AdvancedCalculator {

    public int Plus(DataProvider provider){

        return provider.get("x")+provider.get("y");

    };

    public int Divide(DataProvider provider){
        int x=0;
        int y=0;
        try{
            x=provider.get("x");
            y=provider.get("y");
        }
        catch(KeyNotFoundException ex){
            throw new IllegalArgumentException();
        }

        return provider.get("x")/provider.get("y");

    };


}
