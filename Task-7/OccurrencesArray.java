import java.util.Scanner;

public class OccurrencesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to array occurrence\n");
        int[] numArr = inputArr(input);
        System.out.print("Now enter the number you want to find: ");
        int num = input.nextInt(); 
        int occ = noOfOcc(numArr, num);
        System.out.println("Your element was found " + occ + " times in the array ");
        input.close();
    }
    public static int noOfOcc(int[] numArr, int num){
        int cnt = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] == num) {
                cnt++;
            }
        }
        return cnt;
    }
    public static int[] inputArr(Scanner input){
        System.out.print("Enter the length of array: ");
        int length = input.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < length; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }
}   
