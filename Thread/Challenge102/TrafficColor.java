package Thread.Challenge102;

public enum TrafficColor {
    RED(9000),GREEN(3000),YELLOW(1000);

    private final int timeInMills;
    public int getTimeMills(){
        return timeInMills;
    }
    TrafficColor(int onTimeMills) {
        this.timeInMills = onTimeMills;
    }
    
}
