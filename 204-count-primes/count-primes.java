class Solution {


      public static int countPrimes(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        boolean[] booleans = new boolean[n];
        for (int j = 2; j*j <booleans.length ; j++) {
            if (booleans[j]) {
                continue;
            }
            for (int i = j * 2; i < booleans.length; i += j) {
                if (booleans[i]) {
                    continue;
                }
                booleans[i] = true;
                n -= 1;
            }
        }
        return n-2;
    }
}
