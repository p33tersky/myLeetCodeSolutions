class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxFrequency = 0;
        Map<Integer, Integer> numberToFrequencyMap = new HashMap<>();
        for (int num : nums) {
            int currFreq = numberToFrequencyMap.getOrDefault(num, 0);
            numberToFrequencyMap.put(num, currFreq + 1);
            if (currFreq + 1 > maxFrequency) {
                maxFrequency = currFreq + 1;
            }
        }
        int counter = 0;
        for (int value : numberToFrequencyMap.values()) {
            if (value == maxFrequency) {
                counter++;
            }
        }
        return counter*maxFrequency;
    }
}