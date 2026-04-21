public class TestingThread{
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d:* ",i);
        }
        System.out.println("\n First task done");

        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d:& ",i);
        }
        System.out.println("\nSecond task done");

        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d:$ ",i);
        }
        System.out.println("\nThird task done");  
        long endTime = System.currentTimeMillis();
        System.out.printf("Total time taken: %d",(endTime-startTime));
          
    }
}