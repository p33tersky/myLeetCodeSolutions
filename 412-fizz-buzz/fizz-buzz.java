class Solution {
     public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) {
            StringBuilder s = new StringBuilder();
            if (i % 3 == 0) {
                s.append("Fizz");
            }
            if (i % 5 == 0) {
                s.append("Buzz");
            }
            if (i % 3 != 0 && i % 5 != 0) {
                s.append(i);
            }
            list.add(s.toString());
        }
        return list;
    }
}