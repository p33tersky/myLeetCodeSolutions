class Solution {
    public static int nthUglyNumber(int n) {
        Set<Double> uglyNumbers = new HashSet<>();
        for (int a = 0; a < 31; a++) {
            for (int b = 0; b < 21; b++) {
                for (int c = 0; c < 15; c++) {
                    uglyNumbers.add(Math.pow(2,a)*Math.pow(3,b)*Math.pow(5,c));
                }
            }
        }
        Double[] result = uglyNumbers.toArray(new Double[0]);
        Arrays.sort(result);
        return result[n-1].intValue();
    }
}