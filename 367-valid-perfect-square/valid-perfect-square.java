class Solution {
    public boolean isPerfectSquare(int num) {
         for(int i = 0; i<=num/50000+50000; i++){
             if (i*i==num){
                 return true;
             }
         }
         return false;
        
    }
}