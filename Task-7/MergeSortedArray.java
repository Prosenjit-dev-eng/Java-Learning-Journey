public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = ArrayUtility.inputArr();
        int[] arr2 = ArrayUtility.inputArr();
        int[] mergedArr = merge(arr1,arr2);
        System.out.println("Your merged array is: ");
        ArrayUtility.displayArray(mergedArr);
    }
    public static int[] merge(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        int k = 0;
        int size = arr1.length + arr2.length;
        int[] mergedArr = new int[size];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) 
                mergedArr[k++] = arr1[i++];
            
            else 
                mergedArr[k++] = arr2[j++];
        }
        while (i < arr1.length) {
            mergedArr[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            mergedArr[k++] = arr2[j++];
        }
        return mergedArr;
    }
}
