class Solution {
    public boolean isPerfectSquare(int num) {
         int half;
         if(num%2==1){
             half = (num+1)/2;
         } else {
             half = num/2;
         }
         for(int i = 0; i<=half; i++){
             if (i*i==num){
                 return true;
             }
         }
         return false;
        
    }
}