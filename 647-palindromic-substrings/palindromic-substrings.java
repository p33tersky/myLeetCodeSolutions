class Solution {
    public  int countSubstrings(String s) {
        int counter = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <s.length()+1 ; j++) {
                sb.append(s, i, j);
                if (s.substring(i, j).equals(sb.reverse().toString())){
                    counter++;
                }
                sb.setLength(0);
            }
        }
        return counter;
    }
}