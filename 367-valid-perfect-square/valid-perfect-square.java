class Solution {
    public boolean isPerfectSquare(int num) {
         for(int i = 0; i<=num/10000+10000; i++){
             if (i*i==num){
                 return true;
             }
         }
         return false;
        
    }
}