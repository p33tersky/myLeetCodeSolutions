class Solution {
    public int climbStairs(int n) {
        if(n==0 || n==1){
            return 1;
        }
        int x0 = 1;
        int x1 = 1;
        int xn = 0;
        for (int i = 0; i < n-1; i++) {
            xn = x0+x1;
            x0=x1;
            x1=xn;
        }
        return xn;
    }
}