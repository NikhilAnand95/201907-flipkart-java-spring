package in.conceptarchitect.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleCalculatorTests {

    SimpleCalculator calc;
    int x = 50;
    int y = 15;

    @Before
    public void init(){
         calc = new SimpleCalculator();
    }

    @Test
    public void plusTest() {

        int result = calc.plus(x, y);
        Assert.assertEquals(65, result);
    }

    @Test
    public void minusTest() {

        int result = calc.minus(x, y);
        Assert.assertEquals(x - y, result);
    }

    @Test
    public void mulitplyTest() {

        int result = calc.multiply(x, y);
        Assert.assertEquals(x * y, result);
    }

    @Test
    public void divideTest() {

        int result = calc.divide(x, y);
        Assert.assertEquals(x / y, result);
    }

    @Test(expected = ArithmeticException.class)
    public void divisionWithZeroSecondParameterThrowsException() {

        calc.divide(10, 0);
    }

}
