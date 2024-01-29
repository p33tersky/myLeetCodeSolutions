class Solution {

    public static double distanceToOrigin(int x, int y){
        return  Math.sqrt(x*x+y*y);
    }

    public int[][] kClosest(int[][] points, int k) {
        double [][] kPointsWithDistanceToOrigin = new double[points.length][3];
        for (int i = 0; i < points.length; i++) {
            kPointsWithDistanceToOrigin[i][0] = points[i][0];
            kPointsWithDistanceToOrigin[i][1] = points[i][1];
            kPointsWithDistanceToOrigin[i][2] = distanceToOrigin(points[i][0],points[i][1]);
        }
        Arrays.sort(kPointsWithDistanceToOrigin, Comparator.comparingDouble(d -> d[2]));
        int[][] output = new int[k][];
        for (int i = 0; i < k; i++) {
            int[] point = new int[2];
            point[0] = (int) kPointsWithDistanceToOrigin[i][0];
            point[1] = (int) kPointsWithDistanceToOrigin[i][1];
            output[i] = point;
        }
        return output;
    }
}