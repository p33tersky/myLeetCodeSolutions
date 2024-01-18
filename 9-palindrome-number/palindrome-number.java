class Solution {
   public static boolean isPalindrome(int x){
        StringBuilder SB = new StringBuilder();
        SB.append(x);
        return SB.toString().equals(SB.reverse().toString());
    }
}