class Solution {
     public  int bestClosingTime(String customers) {
        int[] penalties = new int[customers.length()+1];
        int penalty = customers.replaceAll("N","").length();
        penalties[customers.length()] = penalty;
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
            penalties[i] = penalty;
        }
        return index;
    }
}