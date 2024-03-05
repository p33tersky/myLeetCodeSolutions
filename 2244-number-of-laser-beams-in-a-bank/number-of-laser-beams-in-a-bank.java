class Solution {
    public int numberOfBeams(String[] bank) {
        int lastNumOfLasers = bank[0].replaceAll("0", "").length();
        int result = 0;
        for (int i = 1; i < bank.length; i++) {
            int lasersNum = bank[i].replaceAll("0", "").length();
            if (lasersNum == 0) {
                continue;
            }
            result += lastNumOfLasers * lasersNum;
            lastNumOfLasers = lasersNum;
        }
        return result;
    }
}