
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
        fan.setFanSpeed(fanSpeed); ;
    }
    public  void  getFanSpeed(){
        System.out.println(fan.fanSpeed);
    }

    public  static  void Created(){
        System.out.println(created);

    }
    public  void  brightness(int level){
       monitor.setBrightness(level);
    }
    public  void  getSpace(){
        System.out.println("Brand is " + brand);
        System.out.println("Seraial is " + serial_number);
        System.out.println("modal "+ model);
        System.out.println("Mode now is "+mode );
        System.out.println("Power now is " + power);
        System.out.println("Created now " + created);
        System.out.println("Fiter is " +fiter.type);
        System.out.println("Fan speed is " + fan.fanSpeed);
        System.out.println("body is "+ "len = " +body.lengthy+ "high = " + body.high+" width = " + body.Width);
        System.out.println("monitor hight = " + monitor.hight +"monitor lendth"+ monitor.width+"monitor brin " + monitor.brightness);
        System.out.println("Sensor = " + sensor.aqi);
    }

}
