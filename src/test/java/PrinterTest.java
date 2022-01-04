import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer myPrinter;

    @Before
    public void before(){
        myPrinter = new Printer(20, 50);
    }

    @Test
    public void hasNumberOfSheetsOfPaper(){
        assertEquals(20, myPrinter.getNumSheets());
    }

    @Test
    public void canPrint(){
        myPrinter.print(2, 2);
        assertEquals(16, myPrinter.getNumSheets());
    }

    @Test
    public void willPrintIfHasEnoughPaper(){
        myPrinter.print(10, 1);
        assertEquals(10, myPrinter.getNumSheets());
    }

    @Test
    public void willNotPrintIfDoesNotHaveEnoughPaper(){
        myPrinter.print(20, 2);
        assertEquals(20, myPrinter.getNumSheets());
    }

    @Test
    public void hasTonerVolume(){
        assertEquals(50, myPrinter.getTonerVolume());
    }

    @Test
    public void reducesTonerBy1ForEachPagePrinted(){
        myPrinter.print(2, 2);
        assertEquals(46, myPrinter.getTonerVolume());
    }
    

}
