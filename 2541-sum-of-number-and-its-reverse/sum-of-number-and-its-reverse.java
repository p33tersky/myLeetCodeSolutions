class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for (int i = 1; i < num; i++) {
            int rev = 0;
            int j = i;
            while (j != 0) {
                rev = rev * 10 + j % 10;
                j /= 10;
            }
            if (rev + i == num) {
                return true;
            }
        }
        return num == 0;
    }
}