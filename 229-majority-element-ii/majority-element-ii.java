class Solution {

    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        int[] candidates = { nums[nums.length / 3], nums[nums.length * 2 / 3] };
        List<Integer> result = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < 2; i++) {
            int counter = 0;
            for (int j = index; j < nums.length; j++) {
                if (nums[j] == candidates[i]) {
                    counter++;
                    if (counter > nums.length / 3) {
                        if (result.isEmpty() || candidates[0] != candidates[1]) {
                            result.add(candidates[i]);
                        }
                        index = j + 1;
                        break;
                    }
                }
            }
        }
        return result;
    }

}