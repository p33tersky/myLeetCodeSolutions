class Solution {
    public int[] twoSum(int[] nums, int target) {
         int[] tab = new int[2];
        int pos = 0;
        int[] tab2 = new int[2];
        int pos2 = 0;
        for (int i = 0; i < nums.length ; i++) {
            int difference = target - nums[i];
            if (Arrays.stream(nums).filter(n -> n == difference).findAny().isPresent()){
                if (difference==nums[i]){
                    tab2[pos2] = i;
                    pos2++;
                }else {
                    tab[pos] = i;
                    pos++;
                }
            }
            if (pos > 1) {
                break;
            }

        }
        if (tab[0] == 0 && tab[1] ==0){
            return tab2;
        }
        return tab;
    }
}