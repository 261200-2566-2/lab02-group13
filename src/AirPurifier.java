public class AirPurifier {
    Filter filter;
    Sensor sensor;
    Fan fan;
    Specs specs;
    Monitor monitor;
    int mode;
    boolean power = false;
    static int volume = 0;

    AirPurifier(String brand , String serialNumber , String model , double[] dimension) {
        specs = new Specs(brand, serialNumber, model , dimension);
        filter = new Filter();
        fan = new Fan();
        monitor = new Monitor((int)dimension[0]*25/100 , (int)dimension[2]*25/100);
        sensor = new Sensor();
        volume++;
    }
    
    public void turnOn() {
        double magicAQI = Math.random()*499+1 ;
        power = true;
        setFanSpeed(50);
        setMode(1);
        updateAQI(magicAQI);
        setBrightness(100);
    }

    public void turnOff() {
        power = false;
        setFanSpeed(0);
        setMode(0);
        updateAQI(0);
        setBrightness(0);
    }

    public void setMode(int mode) {
        if(power)this.mode= mode;
        if(!power)this.mode = 0;

    }
    
    public void setBrightness(int brightness){
        if(power)monitor.brightness = brightness;
        if(!power)monitor.brightness = 0;
    }

    public void setFanSpeed(int fanSpeed) {
        if(power)fan.setFanSpeed(fanSpeed);
        if(!power)fan.setFanSpeed(0);
    }

    public int getFanSpeed() {
        return fan.fanSpeed ;
    }

    public void updateAQI(double aqi) {
        if(power){sensor.updateCurrentAQI(aqi);}
        if(!power)sensor.updateCurrentAQI(0);
    }

    public static void getVolume() {
        System.out.println(volume);
    }
}
