public class Monitor {
    int brightness = 0;
    int width;
    int height;

    Monitor(int screenWidth, int screenHeight) {
        this.width = screenWidth;
        this.height = screenHeight;

    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
}
