package Thread;
public class ExtendingThreadClass {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();
        System.out.println("\nStarting first task");
        t1.start();
        System.out.println("\nStarting first task");
        t2.start();
        System.out.println("\nStarting first task");
        t3.start();
        long endTime = System.currentTimeMillis();
        System.out.printf("Total time taken: %d", (endTime - startTime)); 
    }
    
}