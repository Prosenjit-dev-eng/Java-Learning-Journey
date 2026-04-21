package Thread.Challenge99;
public class HelloThread extends Thread{

    private  final int thno;

    public HelloThread(int t){
        this.thno = t;
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.printf("Hello from thread-> %d",thno);
        }
    }
}