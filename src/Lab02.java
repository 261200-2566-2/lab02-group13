public class Lab02{
    public static void main(String[] args) {
        String model = "Pro", brand = "Apple", filterType = "Fiter Pro Apple", serialNumber = "1150";
        double[] dimension = {100 , 100 , 100,};
        AirPurifier p1 = new AirPurifier(brand, serialNumber, model, dimension);
        p1.setFanSpeed(1000);
        p1.turnOn();
        p1.setMode(200);
        p1.setBrightness(1000);
        p1.setFanSpeed(1000);
        updateAQI(p1);
        p1.turnOff();
        p1.setMode(200);
        p1.setBrightness(1000);
        p1.setFanSpeed(1000);
        changeFilter(p1, filterType);
        AirPurifier[] p  = new AirPurifier[101];
        for (int i = 0; i < 100; i++) {
            p[i] = new AirPurifier(brand, serialNumber, model, dimension);
        }
        System.out.println(AirPurifier.volume);
    }

    public static void updateAQI(AirPurifier p){
        double AQI = Math.random() * 599 + 1;
        p.updateAQI(AQI);

    }
    public static void changeFilter(AirPurifier p , String Type){
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
}