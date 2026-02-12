import java.util.Scanner;
// page 75
// File name == Class Name
public class Swap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to swapping station\n");

        System.out.print("Enter value of a: ");
        int a = input.nextInt();

        System.out.print("Enter value of b: ");
        int b = input.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Value of a is: " + a);
        System.out.println("Value of b is: " + b);

        input.close();
    }
}
