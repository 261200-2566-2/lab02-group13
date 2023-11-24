public  class  AirPurifier {
    public Filter filter;
    public Sensor sensor;
    public Fan fan;
    public Specs specs;
    public Monitor monitor;
    public String mode;
    public boolean power = false;
    public static int volume = 0;

    AirPurifier(String brand, String serialNumber, String model, double[] dimension) {
        specs = new Specs(brand, serialNumber, model, dimension);
        filter = new Filter();
        fan = new Fan();
        monitor = new Monitor((int) dimension[0] * 25 / 100, (int) dimension[2] * 25 / 100);
        sensor = new Sensor();
        AirPurifier.volume++;
    }

    public void turnOn() {
        double magicAQI = Math.random() * 499 + 1; // Math random from StackOverflow
        power = true;
        setFanSpeed(50);
        setMode("auto");
        updateAQI(magicAQI);
        setBrightness(100);
    }

    public void turnOff() {
        power = false;
        setFanSpeed(0);
        setMode("OFF");
        updateAQI(0);
        setBrightness(0);
    }

    public void setMode(String modee) {
        if (power){
            mode = modee;
        }
        else{
            mode = "OFF";
        }
    }

    public void setBrightness(int brightness) {
        if (power){
            monitor.brightness = brightness;
        }else{
            monitor.brightness = 0;
        }
    }

    public void setFanSpeed(int fanSpeed) {
        if (power){
            fan.setFanSpeed(fanSpeed);
        }else {
            fan.setFanSpeed(0);
        }
    }

    public int getFanSpeed() {
        return fan.fanSpeed;
    }

    public void updateAQI(double aqi) {
        if (power) {
            sensor.updateCurrentAQI(aqi);
        }else{
            sensor.updateCurrentAQI(0);
        }
    }
    public void updateAQI(){
        double AQI = Math.random() * 599 + 1; // Math random from StackOverflow
        updateAQI(AQI);

    }

    public void changeFilter(String Type){
        filter.setType(Type);

    }
    
    

    public static void getVolume() {
        System.out.println("All Production: " + AirPurifier.volume);
    }
}
