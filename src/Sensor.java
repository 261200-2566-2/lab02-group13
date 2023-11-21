public class Sensor {
    double aqi = 0 ;
    public  void  updateCurrentAQI(double aqi){
        this.aqi = aqi ;
    }
    public void getCurrentAQI(){
        System.out.println(this.aqi);
    }
}
