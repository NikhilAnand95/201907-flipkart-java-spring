package in.conceptarchitect.calculator;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class AdvancedCalculatorTests {

    AdvancedCalculator calc;
    DataProvider provider;

    @Before
    public void init(){
        calc=new AdvancedCalculator();
        provider=mock(DataProvider.class); //a class that implements DataProvider
    }


    @Test
    public void testDivideWithNonZeroSecondArg(){
        int x=20;
        int y=5;

        when(provider.get("x")).thenReturn(x);
        when(provider.get("y")).thenReturn(5);

        int result=calc.Divide(provider);

        assertEquals(x/y,result);

    }

    @Test(expected = ArithmeticException.class)
    public void testDivideWithZeroSecondArg(){

        when(provider.get("x")).thenReturn(5);
        when(provider.get("y")).thenReturn(0);

        int result=calc.Divide(provider);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideWithMissingYKey(){

        when(provider.get("x"))
                .thenReturn(5);
        when(provider.get("y"))
                .thenThrow(KeyNotFoundException.class);

        int result=calc.Divide(provider);
    }
}
