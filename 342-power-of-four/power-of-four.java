class Solution {
      public  boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        double log = Math.log(n)/Math.log(4);
        int logAtInd0 = Integer.parseInt(String.valueOf(String.valueOf(log).split("\\.")[0]));
        return Math.pow(4, logAtInd0) == n;
    }
}