class Solution {
    public int triangularSum(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] nextStage = new int[nums.length-1];
        for (int i = 0; i < nextStage.length; i++) {
            nextStage[i] = (nums[i] + nums[i+1]) % 10;
        }
        return triangularSum(nextStage);
    }
}