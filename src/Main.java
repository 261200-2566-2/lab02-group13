// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int w = 10 ; int l = 10 ; int h  = 10 ; int screenwidth = 10 ; int screenhight = 10 ; String serial_number = "OOP" ; String brand = "TonLak" ; String model = "ProMax";
        AirPurifier ton = new AirPurifier(w ,l ,h , screenwidth , screenhight ,serial_number , brand , model);
        ton.getSpace();

        ton.setPowerOn();
        ton.setFanSpeed(1000);
        ton.setAQI(91.5);
        ton.getSpace();
    }
}