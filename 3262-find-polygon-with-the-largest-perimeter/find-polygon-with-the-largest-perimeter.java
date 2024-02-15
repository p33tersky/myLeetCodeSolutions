class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long perimeter = 0;
        for (int i = 0; i < nums.length; i++) {
            perimeter += nums[i];
        }
        for (int i = nums.length - 1; i > -1; i--) {
            int ak = nums[i];
            if (perimeter - 2L * ak > 0) {
                return perimeter;
            }
            perimeter -= ak;
        }
        return -1;
    }
}