class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] pointsInCircle = new int[queries.length];
        int index = 0;
        for (int[] query : queries) {
            for (int[] point : points) {
                if (Math.pow(point[0] - query[0], 2) + Math.pow(point[1] - query[1], 2) <= Math.pow(query[2], 2)) {
                    pointsInCircle[index]++;
                }
            }
            index++;
        }
        return pointsInCircle;
    }
}