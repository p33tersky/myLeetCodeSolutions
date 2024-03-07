class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (indices.get(nums[i]) == null) {
                indices.put(target - nums[i], i);
            } else {
                return new int[] { i, indices.get(nums[i]) };
            }
        }
        return nums;
    }
}