class Solution {
    public static int numRabbits(int[] answers) {
        int sum = 0;
        Map<Integer, Integer> rabbitAnswerMap = new HashMap<>();
        for (int answer : answers) {
            int quantity = rabbitAnswerMap.getOrDefault(answer, 0);
            rabbitAnswerMap.put(answer, quantity + 1);
        }
        for (Map.Entry<Integer, Integer> answer : rabbitAnswerMap.entrySet()) {
            int key = answer.getKey();
            int value = answer.getValue();
            sum += ((value + key) / (key + 1)) * (key + 1);
        }
        return sum;
    }
}