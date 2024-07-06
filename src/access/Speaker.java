package access;

public class Speaker {
    private int volume;

    Speaker(int volume){
        this.volume = volume;
    }

    void volumeUp(){
        if(volume >= 100){
            System.out.println("max volume");
        }else{
            volume += 10;
            System.out.println("volume up");
        }
    }

    void volumeDown(){
        volume -= 10;
        System.out.println("volume down");
    }

    void showVolume(){
        System.out.println(volume);
    }
}
