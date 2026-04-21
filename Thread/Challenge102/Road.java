package Thread.Challenge102;

public class Road {
    public static void main(String[] args) throws InterruptedException{
        TrafficSignal r = new TrafficSignal(TrafficColor.RED);
        TrafficSignal y = new TrafficSignal(TrafficColor.YELLOW);
        TrafficSignal g = new TrafficSignal(TrafficColor.GREEN);

        r.start();
        r.join();
        y.start();
        y.join();
        g.start();

    }
}
