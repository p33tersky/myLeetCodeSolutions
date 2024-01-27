class Solution {
      public  boolean isPowerOfFour(int n) {
        double log = Math.log(n)/Math.log(4);
        return n>0 && log == (int) log;
    }
}