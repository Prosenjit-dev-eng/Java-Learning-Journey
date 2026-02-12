import java.util.Scanner;;
public class Patterns {
    public static void RHP(int n) {
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void RRHP(int n) {
        for (int i = 0; i < n; i++) {
            
            for(int j = 0; j < n - i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void LHP(int n) {
        for (int i = 0; i < n; i++) {
            //Space
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Reverse Right half pyramid");
        RRHP(a);
        System.out.println("Right half pyramid");
        RHP(a);
        System.out.println("Left half pyramid");
        LHP(a);
        sc.close();

    }
}
