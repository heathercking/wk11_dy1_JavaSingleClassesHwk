import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle myBottle;
//    Calculator myCalc;

    @Before
    public void before(){
        myBottle = new WaterBottle(100);
//        myCalc = new Calculator();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, myBottle.getVolume());
    }

    @Test
    public void hasDrinkFunction(){
        myBottle.drink();
        assertEquals(90, myBottle.getVolume());
    }

    
}