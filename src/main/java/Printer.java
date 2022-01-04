public class Printer {

    private int sheets;
    private int tonerVolume;

    public Printer(int sheets, int tonerVolume){
        this.sheets = sheets;
        this.tonerVolume = tonerVolume;
    }

    public int getNumSheets(){
        return this.sheets;
    }

    public int getTonerVolume(){
        return this.tonerVolume;
    }

    public void print(int pages, int copies){
        int totalPages = pages * copies;
        if (this.sheets >= totalPages && this.tonerVolume >= totalPages){
            this.sheets -= totalPages;
            this.tonerVolume -= totalPages;
        }
    }

}
