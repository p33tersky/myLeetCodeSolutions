class Solution {
    private static int returnSumOfSecondPowerOfEveryDigit(int n){
       int sum = 0;
       while (n>0){
           sum += Math.pow(n%10,2);
           n /= 10;
       }
       return sum;
    }

    private static boolean isGivenIntInGivenTable(List<Integer> table, int i){
        for (int k : table) {
            if (k == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean isHappy(int n){
        int m = n;
        List<Integer> list = new ArrayList<>();
        do {
            m = returnSumOfSecondPowerOfEveryDigit(m);
            if (isGivenIntInGivenTable(list,m)){
                return false;
            }
            list.add(m);
        } while (m>1);
        return true;
    }
}