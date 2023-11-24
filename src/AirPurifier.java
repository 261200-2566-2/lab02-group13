public  class  AirPurifier {
    public static Filter filter;
    public static Sensor sensor;
    public static Fan fan;
    public static Specs specs;
    public static Monitor monitor;
    public static String mode;
    public static boolean power = false;
    public static int volume = 0;

    AirPurifier(String brand, String serialNumber, String model, double[] dimension) {
        specs = new Specs(brand, serialNumber, model, dimension);
        filter = new Filter();
        fan = new Fan();
        monitor = new Monitor((int) dimension[0] * 25 / 100, (int) dimension[2] * 25 / 100);
        sensor = new Sensor();
        volume++;
    }

    public static void turnOn(AirPurifier p) {
        double magicAQI = Math.random() * 499 + 1; // Math random from StackOverflow
        power = true;
        p.setFanSpeed(50);
        p.setMode("auto");
        p.updateAQI(magicAQI);
        p.setBrightness(100);
    }

    public static void turnOff(AirPurifier p) {
        power = false;
        p.setFanSpeed(0);
        p.setMode("OFF");
        p.updateAQI(0);
        p.setBrightness(0);
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
    public void updateAQI(AirPurifier p){
        double AQI = Math.random() * 599 + 1; // Math random from StackOverflow
        p.updateAQI(AQI);

    }
    public void changeFilter(AirPurifier p , String Type){
        p.filter.setType(Type);

    }
     public static void printSpecs(AirPurifier p){
        System.out.println("=================== Specs ================");
        System.out.println("Brand: " + p.specs.brand);
        System.out.println("Model: " + p.specs.model);
        System.out.println("SerialNumber: " + p.specs.serialNumber);
        System.out.println("FilterType: " + p.filter.type);
        System.out.println("=================== Status ================");
        System.out.println("Power status: " + p.power);
        System.out.println("Mode: " + p.mode);
        System.out.println("Monitor Brightness: "+ p.monitor.brightness);
        System.out.println("Fanspeed: " + p.getFanSpeed());
        System.out.println("AQI: " + (int)p.sensor.aqi);
        System.out.println("===========================================");
    }
    

    public static void getVolume() {
        System.out.println("All Production: " + volume);
    }
}
