// 7. Modify the given class so that the ith token (1-indexed) of the series is: 
// • "fizzbuzz" if i is divisible by 5 and 7, 
// • "fizz" if i is divisible by 5 and not 9, 
// • "buzz" if i is divisible by 7 and not 3, or 
// • i if i is not divisible by 7 or 5. 
// If n=10 then the output will be [1,2,3,4,fizz,6,buzz,8,9,fizz]. You may use lambda function for 
// only creating Runnable objects
// Name: Prosenjit Hawlader
// Roll No: 002410501066
class FizzBuzzModified {
    private int n;
    private int i = 1;

    public FizzBuzzModified(int n) {
        this.n = n;
    }

    // Thread for "fizz"
    public synchronized void fizz() throws InterruptedException {
        while (true) {
            while (i <= n && !(i % 5 == 0 && i % 7 != 0 && i % 9 != 0)) {
                wait(); // wait until condition matches
            }

            if (i > n) break;

            System.out.println("fizz");
            i++;
            notifyAll(); // wake other threads
        }
    }

    // Thread for "buzz"
    public synchronized void buzz() throws InterruptedException {
        while (true) {
            while (i <= n && !(i % 7 == 0 && i % 5 != 0 && i % 3 != 0)) {
                wait();
            }

            if (i > n) break;

            System.out.println("buzz");
            i++;
            notifyAll();
        }
    }

    // Thread for "fizzbuzz"
    public synchronized void fizzbuzz() throws InterruptedException {
        while (true) {
            while (i <= n && !(i % 5 == 0 && i % 7 == 0)) {
                wait();
            }

            if (i > n) break;

            System.out.println("fizzbuzz");
            i++;
            notifyAll();
        }
    }

    // Thread for numbers
    public synchronized void number() throws InterruptedException {
        while (true) {
            while (i <= n && (i % 5 == 0 || i % 7 == 0)) {
                wait();
            }

            if (i > n) break;

            System.out.println(i);
            i++;
            notifyAll();
        }
    }
}
public class Modified {
    public static void main(String[] args) throws InterruptedException {

        int n = 10;
        FizzBuzzModified fb = new FizzBuzzModified(n);

        Thread A = new Thread(() -> {
            try { fb.fizz(); } catch (Exception e) {}
        });

        Thread B = new Thread(() -> {
            try { fb.buzz(); } catch (Exception e) {}
        });

        Thread C = new Thread(() -> {
            try { fb.fizzbuzz(); } catch (Exception e) {}
        });

        Thread D = new Thread(() -> {
            try { fb.number(); } catch (Exception e) {}
        });

        A.start(); B.start(); C.start(); D.start();

        A.join(); B.join(); C.join(); D.join();
    }
}