class Solution {
    public int[] constructRectangle(int area) {
        int array[] = new int[2];
        for (int i = (int) Math.sqrt(area); i>0; i--){
            if (area%i==0){
                array[0] = area/i;
                array[1] = i;
                break;
            }
        }
        return array;
    }
}