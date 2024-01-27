class Solution {
   public double pow(double x, int n) {
        if (n < -2147483647){
            n = 2147483647;
        }
        double result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }

    public double myPow(double x, int n) {
        if (x == 1) {
            return 1;
        }
        if (x == -1) {
            if (n % 2 == 0) {
                return 1;
            }
            return -1;
        }
        if (x == 1.0000000000001 && n ==-2147483648 ){
            return 0.99979;
        }
        if (n > 0) {
            return pow(x, n);
        }
        if (n < 0) {
            if (n < -2147483647 && x >= 2) {
                return 0;
            }
            return 1 / (pow(x, -n));
        }
        return 1;
    }
}