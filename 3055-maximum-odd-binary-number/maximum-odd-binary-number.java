class Solution {
    public String maximumOddBinaryNumber(String s) {
        int zeros = 0;
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                zeros++;
            }
        }
        if (s.length() - zeros == 0) {
            return "0";
        }
        for (int i = 0; i < s.length() - zeros - 1; i++) {
            result += "1";
        }
        for (int i = 0; i < zeros; i++) {
            result += "0";
        }
        return result + "1";
    }
}