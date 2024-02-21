class Solution {
    private static List<Double> line(double x1, double y1, double x2, double y2) {
        List<Double> points = new ArrayList<>();
        points.add((y1 - y2) / (x1 - x2));
        points.add((x1 * y2 - x2 * y1) / (x1 - x2));
        return points;
    }

    private static boolean isFinite(double d) {
        return Double.POSITIVE_INFINITY != d && Double.NEGATIVE_INFINITY != d;
    }

    public static int maxPoints(int[][] points) {
        if (points.length == 1) {
            return 1;
        }
        if (points.length == 2) {
            return 2;
        }
        Map<List<Double>, Set<int[]>> pointsOnKeyLine = new HashMap<>();
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i; j < points.length; j++) {
                List<Double> coorsOfLineOfGivenPoints = line(points[i][0], points[i][1], points[j][0], points[j][1]);
                if (isFinite(coorsOfLineOfGivenPoints.get(0)) && isFinite(coorsOfLineOfGivenPoints.get(1))) {
                    if (!pointsOnKeyLine.containsKey(coorsOfLineOfGivenPoints)) {
                        Set<int[]> corpoints = new HashSet<>();
                        pointsOnKeyLine.put(coorsOfLineOfGivenPoints, corpoints);
                    }
                    pointsOnKeyLine.get(coorsOfLineOfGivenPoints).add(points[i]);
                    pointsOnKeyLine.get(coorsOfLineOfGivenPoints).add(points[j]);
                }

            }
        }
        int max = 0;
        for (List<Double> key : pointsOnKeyLine.keySet()) {
            Set<int[]> value = pointsOnKeyLine.get(key);
            if (!Double.isNaN(key.get(0)) && !Double.isNaN(key.get(1)) && value.size() > max) {
                max = value.size();
            }
        }
        int verticalCounter = 0;
        Map<Integer, Integer> sameXesOccurrences = new HashMap<>();
        for (int[] point : points) {
            int currValue = sameXesOccurrences.getOrDefault(point[0], 0);
            sameXesOccurrences.put(point[0], currValue + 1);
        }
        for (int xValue : sameXesOccurrences.keySet()) {
            if (sameXesOccurrences.get(xValue) > verticalCounter) {
                verticalCounter = sameXesOccurrences.get(xValue);
            }
        }
        if (verticalCounter > max) {
            max = verticalCounter;
        }
        return max;
    }
}