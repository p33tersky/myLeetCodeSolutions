class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (indices.get(nums[i]) == null) {
                indices.put(key, i);
            } else {
                return new int[] { i, indices.get(nums[i]) };
            }
        }
        return nums;
    }
}