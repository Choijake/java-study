package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(10);

        speaker.showVolume();
        speaker.volumeUp();

        //필드 직접 접근이 가능
//        speaker.volume = 200;
//        speaker.showVolume();
    }
}
