
public class AirPurifier {
    Fiter fiter ;
    Sensor sensor ;
    Fan fan ;
    Spec body ;
    Monitor monitor ;
    String mode ;
    boolean power;
    static  int created;
    String serial_number ;
    String brand ;
    String model ;


   AirPurifier(int w , int l , int h ,int screenwidth , int screenhight , String serial_number , String brand , String model){
      body = new Spec(w , l , h );
      fiter = new Fiter();
      fan = new Fan();
      monitor = new Monitor(screenwidth , screenhight);
      sensor = new Sensor();
      this.brand = brand ;
      this.serial_number  = serial_number ;
      this.model = model ;
      this.mode = "auto";
      created++ ;
   }
   AirPurifier(int w , int l , int h ,int screenwidth , int screenhight, String serial_number , String brand , String model, String fiterType){
       this( w , l , h ,screenwidth , screenhight, serial_number , brand ,model);
      fiter.type = fiterType ;
   }

    public  void setPowerOn(){
       power = true ;
    }
    public  void setPowerOff(){
       power = false ;
    }
    public  void setMode(String mode){
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
       if(power){
           fan.setFanSpeed(fanSpeed);
       }
    }
    public  void  getFanSpeed(){
       if(power){
        System.out.println(fan.fanSpeed);}
    }

    public  static  void Created(){
        System.out.println(created);

    }
    public  void  setBrightness(int level){
       monitor.setBrightness(level);
    }
    public  void  setAQI(double AQI){
       if(power){
           sensor.updateCurrentAQI(AQI);
       }

    }
    public  void  getinformation(){
        System.out.println("Brand = " + brand);
        System.out.println("Seraial = " + serial_number);
        System.out.println("modal = "+ model);
        System.out.println("Mode = "+mode );
        System.out.println("Power = " + power);
        System.out.println("Created = " + created);
        System.out.println("Fiter = " +fiter.type);
        System.out.println("Fan speed = " + fan.fanSpeed);
        System.out.println("body : "+ "len = " +body.lengthy+ "high = " + body.high+" width = " + body.Width);
        System.out.println("monitor: hight = " + monitor.hight +" width = "+ monitor.width+" brightness = " + monitor.brightness);
        System.out.println("Sensor = " + sensor.aqi);
    }

}
