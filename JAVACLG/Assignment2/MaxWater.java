/*1. An integer array representing height of length n is given as input. There are n vertical lines drawn from the array such that the two endpoints of the ith line are (i, 0) and (i, height[i]). Any two lines along with the x-axis form a container that can hold water. Find the largest container that can hold maximum water. Collection classes are NOT allowed. */
// Name: Prosenjit Hawlader
// Roll: 002410501066

class MaxWater{
    public static int maxWater(int[] height){
        int left = 0, right = height.length - 1;
        int maxW = 0;
        while (left<right) {
            int width = right - left;
            int minH = Math.min(height[left],height[right]);
            int water = minH*width;

            if (water > maxW) {
                maxW = water;
            }

            if (height[left] < height[right]) {
                left++;
            }
            else{
                right--;
            }
        }
        return maxW;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println("Maximum water stored: "+maxWater(height));
    }
}