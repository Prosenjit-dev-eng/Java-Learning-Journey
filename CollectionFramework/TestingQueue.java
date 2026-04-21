
import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {
    public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    q.add(5);
    q.offer(2);
        Utility.print(q);
        System.out.println(q.peek());
        System.out.println(q.element());

    }
}
