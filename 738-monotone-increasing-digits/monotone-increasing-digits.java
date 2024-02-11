class Solution {

    public int monotoneIncreasingDigits(int n) {
        String number = String.valueOf(n);
        int[] digits = new int[number.length()];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = Character.getNumericValue(number.charAt(i));
        }
        int lastCorrIndex = digits.length - 1;
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i - 1] > digits[i]) {
                for (int j = i; j <= lastCorrIndex; j++) {
                    digits[j] = 9;
                }
                digits[i - 1] = digits[i - 1] - 1;
                lastCorrIndex = i - 1;
            }
        }
        int k = 0;
        for (int i = 0; i < digits.length; i++) {
            k += digits[i] * Math.pow(10, digits.length - 1 - i);
        }
        return k;
    }
}