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