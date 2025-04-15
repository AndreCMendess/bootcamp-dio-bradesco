package Model;
import Interface.Internet;
import Interface.Ipod;
import Interface.Telphone;

public class Iphone2007 implements Ipod, Internet , Telphone {

    private final boolean touchScren = true;
    private boolean connect = false;
    private boolean playing = false;
    private int volume = 50;


    public void increaseVolume() {
        this.volume += 1;
        System.out.println("Increase Volume");
    }

    public void descreaseVolume() {
        this.volume -= 1;
        System.out.println("Diminuindo VOlume");
    }

    @Override
    public void call(String number) {
       System.out.println("Making a call");
    }

    @Override
    public void answer() {
        System.out.println("Answering a call");
    }

    @Override
    public void hangUp() {
        System.out.println("Hanging up a call");
    }

    @Override
    public void connect() {
        this.connect = true;
        System.out.println("Connecting the internet");
       
    }

    @Override
    public void disconect() {
        this.connect = false;
        System.out.println("Disconected the internet");   
    }

   

    @Override
    public void browser(String url) {
        if(connect) {
            System.out.println("Browsing to " + url);
        }  else {
            System.out.println("Cannot browse. No internet connection.");
        }
      
    }

    @Override
    public void nextSong() {
        System.out.println("Next Song");
    }

    @Override
    public void previousSong() {
       System.out.println("Prev Song");
    }

    @Override
    public boolean isConnected() {
       return this.connect;
    }

    @Override
    public void playMusic() {
         this.playing = true;  
    }

    @Override
    public void pauseMusic() {
        this.playing = false;
    }

 

}
