package JAVACLG.Assignment1;

import java.util.Scanner;

public class SI {
    public static void main(String[] args){
        Scanner var1 = new Scanner(System.in);
        System.out.println("Enter two short integers");
        short var2 = var1.nextShort();
        System.out.println("Value of first short int is: "+var2);
        short var3 = var1.nextShort();
        System.out.println("Value of first short int is: " + var3);
        short finale = (short)(var2+var3);
        System.out.println("Value of sum is: " + finale);

        var1.close();

    }
}
