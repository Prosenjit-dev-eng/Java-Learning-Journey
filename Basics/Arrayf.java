class Arrayf {
    public static void main(String[] args) {
        // We make a JavaUtilty class in this basic folder, Java provides it into my code
        int[] numArray = ArrayUtility.inputArr();
        long sum = sum(numArray);
        System.out.println("Sum of the numbers: "+sum);
    }
    public static long sum(int []numArray){
        long sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            sum += numArray[i];
        }
        return sum;
    }
}
