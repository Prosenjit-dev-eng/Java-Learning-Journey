import java.util.*;
public class Challenge89 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter an integer: ");
            int a = input.nextInt();
            System.out.println("Enter next integer: ");
            int b = input.nextInt();
            int res = a/b;
            System.out.println("Result is: "+res);
        } 
        catch (ArithmeticException e) 
        {
            if (e.getMessage().equals("/ by zero")) {
                System.out.println("Divide by zero occured.");
            }
            else{
                throw e;
            }
        }
        finally{
            System.out.println("End");
        }
        input.close();
    }
}
