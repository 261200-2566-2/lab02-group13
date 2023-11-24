public class Monitor {
    int brightness = 0;
    int width;
    int height;

    Monitor(int screenWidth, int screenHeight) {
        this.width = screenWidth;
        this.height = screenHeight;

    }
    
    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
        }else{
            System.out.println("Brightness invalid should between 0 and 100");
        }
    }
}
