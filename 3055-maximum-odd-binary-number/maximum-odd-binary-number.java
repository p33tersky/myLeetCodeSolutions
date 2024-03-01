class Solution {
    public String maximumOddBinaryNumber(String s) {
        int zeros = (int) s.chars().filter(ch -> ch == '0').count();
        String result = "";
        for (int i = 0; i < s.length() - zeros - 1; i++) {
            result += "1";
        }
        for (int i = 0; i < zeros; i++) {
            result += "0";
        }
        result += "1";
        return result;
    }
}