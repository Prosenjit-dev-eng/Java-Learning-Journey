
import java.util.Scanner;

class DeleteArray {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Welcome to array deletion");

        int[] numArr = ArrayUtility.inputArr();
        System.out.print("Now, enter the number you want to delete: ");
        int numD = inp.nextInt();
        int[] newArr = deleteNumber(numArr, numD);
        System.out.println("Here is your newArray");
        ArrayUtility.displayArray(newArr);
        inp.close();
    }
    public static int[] deleteNumber(int[] numArr, int n){
        int occ = OccurrencesArray.noOfOcc(numArr, n);
        if (occ == 0) {
            return numArr;
        }
        int newSize = numArr.length - occ;
        int i = 0, j = 0;
        int[] newArr = new int[newSize];
        while (i < numArr.length) {
            if (numArr[i] != n) {
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }

        return newArr;
    }
    
}