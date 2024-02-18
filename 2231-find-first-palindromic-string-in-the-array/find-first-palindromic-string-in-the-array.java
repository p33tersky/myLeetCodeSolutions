class Solution {
    private static boolean isPalindrome(String word) {
        char[] letters = word.toCharArray();
        for (int i = 0; i < letters.length / 2 ; i++) {
            if (letters[i] != letters[letters.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }
}