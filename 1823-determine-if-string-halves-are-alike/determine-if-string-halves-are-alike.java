public class Solution {
  
  
     private static char[] vowels() {
        return new char[]{'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};
    }

    private static String[] halvesOfStringReturner(String word) {
        int size = word.length();
        String[] stringSplit = new String[2];
        stringSplit[0] = word.substring(0, size / 2 );
        stringSplit[1] = word.substring(size / 2 , size);

        return stringSplit;
    }

    private static boolean isGivenSignAVowel(char sign) {
        char[] vowels = vowels();
        for (char vowel : vowels) {
            if (sign == vowel) {
                return true;
            }
        }
        return false;
    }

    private static int vowelCounter(String word) {
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (isGivenSignAVowel(word.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean halvesAreAlike(String s){
        String[] halves = halvesOfStringReturner(s);
        int firstHalfCounter = vowelCounter(halves[0]);
        int secondHalfCounter = vowelCounter(halves[1]);
        return firstHalfCounter == secondHalfCounter;

    }

}
