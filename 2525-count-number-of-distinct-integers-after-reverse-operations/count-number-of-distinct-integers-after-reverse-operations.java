class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        for (int num : nums) {
            uniqueNums.add(num);
            int rev = 0;
            while (num != 0) {
                rev = rev * 10 + num % 10;
                num /= 10;
            }
            uniqueNums.add(rev);
        }
        return uniqueNums.size();
    }
}