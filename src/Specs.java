public class Specs {
    double height;
    double width;
    double length;
    String model, serialNumber, brand;

    Specs(String brand , String model , String serialNumber ,double[] dimension){
        this.serialNumber = serialNumber;
        this.model = model;
        this.brand = brand ;
        height = dimension[0];
        width = dimension[1];
        length = dimension[2];
    }
}
