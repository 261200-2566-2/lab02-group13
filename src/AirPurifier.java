public class AirPurifier {
    Filter filter;
    Sensor sensor;
    Fan fan;
    Specs body;
    Monitor monitor;
    SerialNumber serialNumber;
    int mode;
    boolean power = false;
    static int created = 0;



    AirPurifier(int w, int l, int h, int screenWidth, int screenHeight) {
        body = new Specs(w, l, h);
        filter = new Filter();
        fan = new Fan();
        monitor = new Monitor(screenWidth, screenHeight);
        sensor = new Sensor();
        serialNumber = new SerialNumber();
    }

    public void togglePower() {
        power = !power;
    }

    public void setPowerOn() {
        power = true;
    }

    public void setPowerOff() {
        power = false;
    }

    public void setMode(int mode) {
        if (power) {
            this.mode = mode;
        } else {
            System.out.println("power is " + power);
        }

    }

    public void checkMode() {
        if (power) {
            System.out.println(mode);
        } else {
            System.out.println("power is " + power);
        }
    }

    public void setFanSpeed(int fanSpeed) {
        fan.fanSpeed = fanSpeed;
    }

    public void getFanSpeed() {
        System.out.println(fan.fanSpeed);
    }

    public void updateCurrentAQI(double aqi) {
        sensor.aqi = aqi;
    }

    public void getCurrentAQI() {
        System.out.println(sensor.aqi);
    }

    public static void Created() {
        System.out.println(created);
    }

    public void getSerialNumber() {
        System.out.println(serialNumber);
    }
}
