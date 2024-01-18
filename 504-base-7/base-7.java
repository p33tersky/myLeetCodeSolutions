class Solution {
    public String convertToBase7(int n) {
        if(n==0){
            return "0";
        }
        boolean isGreaterThanZero = n > 0;
        if (!isGreaterThanZero){
            n=-n;
        }
        StringBuilder sb = new StringBuilder();
        while (n>0){
            sb.append(n%7);
            n/=7;
        }
        if (!isGreaterThanZero){
            sb.append("-");
        }
        return sb.reverse().toString();
    }
}