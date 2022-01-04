import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer myPrinter;

    @Before
    public void before(){
        myPrinter = new Printer(20);
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

}
