import java.util.Scanner;
// Page 84
public class Cond {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int Marks;
        System.out.print("Enter Marks: ");
        Marks = inp.nextInt();
        if (Marks >= 90 && Marks <= 100) {
            System.out.println("A");
        }
        else if (Marks >= 75) {
            System.out.println("B");
            
        }
        else if (Marks >= 60) {
            System.out.println("C");
            
        }
        else if (Marks >= 30) {
            System.out.println("D");
        }
        else{
            System.out.println("F");

        }
        inp.close();
    }
}
