public class Lab02 {
    public static void main(String[] args) {
        String brand = "Appel" , serialNumber = "123123123", model = "Pro" ; 
        double[] dimension ={100 ,100 ,100} ;
        AirPurifier p1 = new AirPurifier(brand , serialNumber , model , dimension);
        AirPurifier p2 = new AirPurifier(brand , serialNumber , model , dimension);
        p1.turnOn();
        printSpecs(p1);
        p1.updateAQI(1000);
        p1.setFanSpeed(1000);
        p1.setBrightness(1000);
        p1.setMode("Fuck You");
        p1.changeFilter("Apple fiter Pro");
        p1.turnOff();
        p1.updateAQI(1000);
        p1.setFanSpeed(1000);
        p1.setBrightness(1000);
        p1.setMode("AAAAA");
        p1.changeFilter("OOOO"); 
        p2.turnOn();
        printSpecs(p2);
        p2.updateAQI(1000);
        p2.setFanSpeed(1000);
        p2.setBrightness(1000);
        p2.setMode("Fuck You");
        p2.changeFilter("Apple fiter Pro");
        p2.turnOff();
        p2.updateAQI(1000);
        p2.setFanSpeed(1000);
        p2.setBrightness(1000);
        p2.setMode("AAAAA");
        p2.changeFilter("OOOO"); 
        

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
