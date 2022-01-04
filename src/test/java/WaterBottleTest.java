import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle myBottle;
//    Calculator myCalc;

    @Before
    public void before(){
        myBottle = new WaterBottle();
//        myCalc = new Calculator();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, myBottle.getVolume());
    }

    @Test
    public void canDrinkAndReduceVolumeBy10(){
        myBottle.drink();
        assertEquals(90, myBottle.getVolume());
    }

    @Test
    public void canEmptyBottleAndReduceVolumeTo0(){
        myBottle.empty();
        assertEquals(0, myBottle.getVolume());
    }

    @Test
    public void canFillBottleBackToVolume100(){
        myBottle.fill();
        assertEquals(100, myBottle.getVolume());
    }
}
