class Solution {
    public int minimumLength(String s) {
        LinkedList<Character> signs = new LinkedList<>();
        for (char c : s.toCharArray()) {
            signs.add(c);
        }
        while (!signs.isEmpty() && signs.getFirst() == signs.getLast()) {
            char sign = signs.getFirst();
            if (signs.size() == 1) {
                return 1;
            }
            while (!signs.isEmpty() && signs.getFirst() == sign) {
                signs.removeFirst();
            }
            while (!signs.isEmpty() && sign == signs.getLast()) {
                signs.removeLast();
            }
        }

        return signs.size();
    }
}