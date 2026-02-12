import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give odd or even number");
        int n = input.nextInt();
        if ((n & 1)!=0) {
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");

        }

        input.close();
    }
}
