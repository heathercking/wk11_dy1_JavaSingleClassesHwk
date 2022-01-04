public class Printer {

    private int sheets;

    public Printer(int sheets){
        this.sheets = sheets;
    }

    public int getNumSheets(){
        return this.sheets;
    }

    public void print(int pages, int copies){
        this.sheets -= pages * copies;
    }
}
