
public class AirPurifier {
    Fiter fiter ;
    Sensor sensor ;
    Fan fan ;
    Spec body ;
    Monitor monitor ;
    int mode ;
    boolean power = false ;
    static  int created = 0 ;
    String serial_number ;

   AirPurifier(int w , int l , int h ,int screenwidth , int screenhight ){
      body = new Spec(w , l , h );
      fiter = new Fiter();
      fan = new Fan();
      monitor = new Monitor(screenwidth , screenhight);
      sensor = new Sensor();
   }

    public void togglePower() {
        power = !power ;
    }
    public  void setPowerOn(){
       power = true ;
    }
    public  void setPowerOff(){
       power = false ;
    }
    public  void setMode(int  mode){
        if (power){
            this.mode = mode ;
        }else {
            System.out.println("power is " + power);
        }

    }
    public  void checkMode(){
       if (power){
           System.out.println(mode);
       }else {
           System.out.println("power is " + power);
       }
    }
    public void setFanSpeed(int fanSpeed){
        fan.fanSpeed = fanSpeed ;
    }
    public  void  getFanSpeed(){
        System.out.println(fan.fanSpeed);
    }
    public  void  updateCurrentAQI(double aqi){
       sensor.aqi = aqi ;
    }
    public void getCurrentAQI(){
        System.out.println(sensor.aqi);
    }
    public  static  void Created(){
        System.out.println(created);
    }
}
