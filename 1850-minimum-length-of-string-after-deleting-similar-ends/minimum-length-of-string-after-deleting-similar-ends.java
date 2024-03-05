class Solution {
    public int minimumLength(String s) {
         char[] signs = s.toCharArray();
        int l = s.length();
        int i = 0;
        int j = l-1;
        while (j>i){
            if (signs[i] != signs[j]){
                break;
            }
            char c = signs[i];
            while ( j>= i && signs[i] == c){
                i++;
            }
            while (j >= i && signs[j] == c){
                j--;
            }
        }
        return 1+j-i;
    }
}