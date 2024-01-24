class Solution {
     public static int bestClosingTime(String customers) {
        int penalty = customers.replaceAll("N","").length();
        int min = penalty;
        int index = 0;
        for (int i = customers.length()-1; i >=0 ; i--) {
            String sign = Character.toString(customers.charAt(customers.length()-i-1));
            if (sign.equals("Y")){
                penalty--;
                if (penalty < min){
                    min = penalty;
                    index = customers.length()-i;
                }
            } else if (sign.equals("N")){
                penalty++;
            }
        }
        return index;
    }
}