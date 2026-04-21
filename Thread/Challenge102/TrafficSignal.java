package Thread.Challenge102;

public class TrafficSignal extends Thread{
    private final TrafficColor color;

    public TrafficSignal(TrafficColor color){
        this.color = color;
    }

    @Override
    public void run(){
        System.out.printf("%s active\n", color);
        try{
            Thread.sleep(color.getTimeMills());
        }
        catch (InterruptedException e){
            throw  new RuntimeException(e);
        }
        System.out.printf("%s inactive\n",color);
    }

}
