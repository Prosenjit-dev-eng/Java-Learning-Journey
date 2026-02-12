package Basics;
import java.util.Scanner;
public class ArrayUtility {
    public static int[] inputArr() {
        Scanner input = new Scanner((System.in));
        System.out.print("Please enter the size: ");
        int s = input.nextInt();
        int[] nums = new int[s];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
        input.close();
        return nums;
    }
    public static void displayArray(int[] numArr){
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] + " ");
        }
    }
     
}
