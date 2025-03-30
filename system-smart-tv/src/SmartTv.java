public class SmartTv {

    boolean on = false;
    int channel = 1;
    int volume = 25;

    public void toConnect() {
        this.on = true;
    }

    public void toDisconnect() {
        this.on = false;
    }
    
    public void increaseVol() {
        this.volume++;
        System.out.println(this.volume);
    }

    public void toDecrease() {
        this.volume--;
        System.out.println(this.volume);
    }

    public void toChangeChannel(int ch){
        this.channel = ch;
    }

    

    public static void main(String[] args) throws Exception {

        SmartTv smart = new SmartTv();
        smart.toConnect();
       
         
        if(!smart.on){
            System.out.println("Tv Desligada");
        }else{
            System.out.println("Tv Ligada");
            System.out.println(("Canal Atual: " + smart.channel));
            System.out.println(("Volume Atual :" + smart.volume));    
            smart.increaseVol();
            smart.increaseVol();
            smart.increaseVol();
            smart.increaseVol();
            smart.toChangeChannel(12);
            System.out.println(("Canal Atual: " + smart.channel));

        }
     }
}

