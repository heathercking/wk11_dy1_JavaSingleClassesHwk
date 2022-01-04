import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator myCalc;

    @Before
    public void before(){
        myCalc = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(5, myCalc.add(2, 3));
    }

    @Test
    public void canSubtract(){
        assertEquals(3, myCalc.subtract(5, 2));
    }

    @Test
    public void canMultiply(){
        assertEquals(6, myCalc.multiply(3, 2));
    }

    @Test
    public void canDivide(){
        assertEquals(2.50, myCalc.divide(5, 2), 0.0);
    }
}
