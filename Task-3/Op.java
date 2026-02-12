import java.util.Scanner;
// Page 80
public class Op {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter value of a: ");
            int a = input.nextInt();

            System.out.print("Enter value of b: ");
            int b = input.nextInt();

            System.out.print("Enter value(floating number) of f: ");
            float f = input.nextFloat();

            System.out.print("Enter value of g: ");
            float g = input.nextFloat();

            int c = a+b;
            System.out.println("Value of addition is: " + c);

            int d = a - b;
            System.out.println("Value of subtraction is: " + d);

            int h = a*b;
            System.out.println("Value of multipication is: " + h);

            int i = a/b;
            System.out.println("Value of division is: " + i);


            float fg = f*g;
            System.out.println("Value of floating multipication is: " + fg);

            input.close();

        }
    
}
