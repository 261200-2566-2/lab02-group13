public class Fan {
    int fanSpeed = 0;
    public void setFanSpeed(int fanSpeed) {
        if (fanSpeed >= 0 && fanSpeed <= 100) {
            this.fanSpeed = fanSpeed;
        }else{
            System.out.println("FanSpeed invalid should between 0 and 100");
        }
    }
}
