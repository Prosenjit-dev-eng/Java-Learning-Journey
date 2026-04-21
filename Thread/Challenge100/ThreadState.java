package Thread.Challenge100;

public class ThreadState extends Thread{
    @Override
    public void run(){
        try {
            Thread.sleep(50000);
            System.out.printf("\n From inside run %s: ", Thread.currentThread().getName());
        } 
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
