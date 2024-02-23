class Solution {
     public int[] countPoints(int[][] points, int[][] queries) {
        int[] pointsInCircle = new int[queries.length];
        int index = 0;
        for (int[] query : queries) {
            for (int[] point : points) {
                if ((point[0] - query[0]) * (point[0] - query[0])
                        + (point[1] - query[1]) * (point[1] - query[1])
                        <= query[2] * query[2]) {
                    pointsInCircle[index]++;
                }
            }
            index++;
        }
        return pointsInCircle;
    }
}