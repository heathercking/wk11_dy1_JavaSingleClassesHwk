public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public void setVolume(int newVolume){
        this.volume = newVolume;
    }

    public void drink(){
        this.volume -= 10;
    }
}
