import Model.Iphone2007;

public class Challenge {
    public static void main(String[] args) throws Exception {
        Iphone2007 iphone = new Iphone2007();
        iphone.call("912344321");
        iphone.hangUp();
        iphone.playMusic();
        iphone.increaseVolume();
        iphone.increaseVolume();
        iphone.increaseVolume();
        iphone.nextSong();
        iphone.pauseMusic();
        iphone.connect();
        iphone.browser("google.com");
    }
}
