class Solution {
    public  boolean isTriangleValid(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length-1; i >1 ; i--) {
            if (isTriangleValid(nums[i],nums[i-1],nums[i-2])){
                return nums[i] + nums[i-1] + nums[i-2];
            }
        }
        return 0;
    }
}