import java.util.Scanner;
class LCMGCD {
    public static int gcd(int a, int b) {
        while(b!=0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        int g = gcd(a,b);
        int l = (a / g) * b;
        System.out.println("LCM: " +l);
        System.out.println("GCD: " +g);


        sc.close();

    }
}