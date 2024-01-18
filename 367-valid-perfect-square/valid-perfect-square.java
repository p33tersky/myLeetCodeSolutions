class Solution {
    public boolean isPerfectSquare(int num) {
         for(int i = 0; i<=num/500000+500000; i++){
             if (i*i==num){
                 return true;
             }
         }
         return false;
        
    }
}