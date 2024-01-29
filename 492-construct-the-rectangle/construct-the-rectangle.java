class Solution {
    public static int[] constructRectangle(int area) {
        List<Integer> dividers = new ArrayList<>();
        for (int i = area; i > 0 ; i--) {
            if (area%i==0){
                dividers.add(i);
            }
        }
        int[] array = new  int[2];
        if (dividers.size()%2==0){
            array[0] = dividers.get(dividers.size()/2-1);
            array[1] = dividers.get(dividers.size()/2);
            return array;
        }
        array[0] = dividers.get((dividers.size()-1)/2);
        array[1] = array[0];
        return array;
    }
}