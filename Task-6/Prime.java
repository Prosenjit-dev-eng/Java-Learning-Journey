import java.util.Scanner;
public class Prime {
    static boolean isPrime(int n) {
    if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
    return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        boolean p = isPrime(a);
        System.out.println("Prime: " +p);

        sc.close();

    }

}
