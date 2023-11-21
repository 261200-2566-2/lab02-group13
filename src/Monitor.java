public class Monitor {
    int brightness = 0 ;
    int width ;
    int  hight ;
    Monitor(int screenwidth , int screenhight){
        this.width = screenwidth ;
        this.hight  = screenhight ;

    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
}
