class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        int i = 2;
        do {
            if (n % i == 0) {
                if (i != 2 && i != 3 && i != 5) {
                    return false;
                }
                n /= i;
            } else {
                i++;
            }
            if (i > 5){
                return false;
            }
        }while (n>1);
        return true;

    }
}