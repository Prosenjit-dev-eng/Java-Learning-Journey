
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Challenge88 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String filename = input.nextLine();
        try(FileReader reader = new FileReader(filename)) {
            int read = 0;
            while ((read = reader.read()) != -1) {
                System.out.print((char)read);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: "+e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
        
    }    
}
// 2) There is a class that contains an integer indicating the no of items available at a store. 
// There is a Producer class that updates this count whenever a new item is produced and a Consumer class that reduces the count whenever an item has been consumed. 
// Both the Producer and the Consumer classes should access the item count integer in a consistent manner.
//  Write suitable Java code to implement such a scenario

import java.util.Scanner;

class Num{
    int a;
    boolean is_Empty;
    Num(int b){a=b;is_Empty=(a==0);}
    synchronized void inc(){a++;}
    synchronized void dec(){a--;}

}

class Producer implements Runnable{
    Num a; 
    Producer(Num a){this.a=a;}
    public void run(){
        a.inc();
    }
}
class Consumer implements Runnable{
    Num a;
    Consumer(Num a){this.a=a;}
    public void run(){
        if (!a.is_Empty)a.dec();
        else System.out.println("store is empty, waiting for producer to produce an item");
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Num a = new Num(sc.nextInt());
        Thread t1=new Thread(new Producer(a));
        Thread t2=new Thread(new Consumer(a));
        t1.start();
        t2.start();
        sc.close();
        while (t1.isAlive() || t2.isAlive()){
            try{
            t1.join();
            t2.join();}     
            catch(InterruptedException e){System.out.println("interrupted exception");} 
    }
    }
}