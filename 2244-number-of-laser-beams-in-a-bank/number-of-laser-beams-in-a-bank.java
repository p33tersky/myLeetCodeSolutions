class Solution {
    public int numberOfBeams(String[] bank) {
        int[] numOfLasers = new int[bank.length];
        for (int i = 0; i < bank.length; i++) {
            for (int j = 0; j < bank[i].length(); j++) {
                if (bank[i].charAt(j) == '1') {
                    numOfLasers[i]++;
                }
            }
        }
        int result = 0;
        int last = numOfLasers[0];
        for (int i = 1; i < numOfLasers.length; i++) {
            if (numOfLasers[i] == 0){
                continue;
            }
            result += last * numOfLasers[i];
            last = numOfLasers[i];
        }
        return result;
    }
}