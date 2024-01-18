class Solution {
    public boolean isPerfectSquare(int num) {
         for(int i = 0; i<=(num+1)/2; i++){
             if (i*i==num){
                 return true;
             }
         }
         return false;
        
    }
}