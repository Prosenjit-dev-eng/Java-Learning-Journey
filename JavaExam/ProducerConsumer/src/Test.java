import java.util.LinkedList;
import java.util.Queue;

public class Test {
        int capacity;
        Queue<Integer> queue = new LinkedList<Integer>();
        public Test(int capacity) {
            this.capacity = capacity;
        }
        public synchronized void produce(int value) throws InterruptedException {
            while (queue.size() == capacity){
                wait();// Wait until there is space in the queue
            }
            queue.offer(value);
            System.out.println("Produced: "+value);
            notifyAll();
        }
        public synchronized void consume() throws InterruptedException {
            while (queue.isEmpty()){
                wait();// Wait until item is consumed
            }
            int value = queue.poll();
            System.out.println("Consumed: "+value);
            notifyAll();
        }

    public static void main(String[] args){
        Test t = new Test(5);
        Thread producerThread = new Thread(() -> {
            try{
               for (int i = 0; i < 10; i++) {
                   t.produce(i);
                   Thread.sleep(100);
               }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread consumerThread = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    t.consume();
                    Thread.sleep(100);
                }
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        producerThread.start();
        consumerThread.start();
    }
}