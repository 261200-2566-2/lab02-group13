public class Lab02 {
    public static void main(String[] args) {
        String model = "Pro", brand = "Apple", filterType = "Fiter Pro Apple", serialNumber = "1150";
        double[] dimension = {100 , 100 , 100,};
        AirPurifier p1 = new AirPurifier(brand, serialNumber, model, dimension);
        p1.turnOn();
        p1.setFanSpeed(10000); //ลอง fanSpeed ให้มากเกิน 2000 output -> FanSpeed invalid should between 0 and 2000
        p1.setMode("Healthy"); //เปลี่ยน  Mode Mode -> Healthy
        p1.setBrightness(1000);//เปลี่ยน Brightness -> 1000
        p1.setFanSpeed(1000); // เปลี่ยน Fanspeed -> 1000
        printSpecs(p1); // พิมค่าออกมาว่าเครื่องมี Space เป็นยังไงบ้าง
        changeFilter(p1, filterType);//เปลี่ยนกลองใหม่;
        updateAQI(p1);
        printSpecs(p1);

        AirPurifier[] p  = new AirPurifier[101];
        //ลองสร้างเครื่องขึ้นรมาใหม่ แล้วดูว่าตอนนี้ ผลิตไปกี่เครื่องแเล้ว
        for (int i = 0; i < 100; i++) {
            p[i] = new AirPurifier(brand, serialNumber, model, dimension);
        }
        AirPurifier.getVolume();
    }

    public static void updateAQI(AirPurifier p){
        double AQI = Math.random() * 599 + 1; // Math random from StackOverflow
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
