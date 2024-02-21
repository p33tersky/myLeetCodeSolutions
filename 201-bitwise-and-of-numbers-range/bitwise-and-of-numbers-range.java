class Solution {
    private static List<Integer> powersOfTwo(int n) {
        List<Integer> powers2 = new ArrayList<>();
        double limit = Math.log(n + 1) / Math.log(2);
        for (int i = 0; i < limit; i++) {
            powers2.add((int) Math.pow(2, i));
        }
        return powers2;
    }

    private static char[] bitRepresentation(int n) {
        if (n == 2147483647) {
            return "01111111111111111111111111111111".toCharArray();
        }
        char[] starter = "00000000000000000000000000000000".toCharArray();
        List<Integer> indexes = powersOfTwo(n);
        for (int i = indexes.size(); i > 0; i--) {
            if (indexes.get(i - 1) <= n) {
                starter[starter.length - i] = '1';
                n -= indexes.get(i - 1);
            }
        }

        return starter;
    }

    public static int rangeBitwiseAnd(int left, int right) {
        char[] bits = new char[32];
        char[] leftToBIT = bitRepresentation(left);
        char[] rightToBIT = bitRepresentation(right);
        for (int i = 0; i < 32; i++) {
            if (leftToBIT[i] == rightToBIT[i]) {
                bits[i] = leftToBIT[i];
            } else {
                for (int j = i; j < 32; j++) {
                    bits[j] = '0';
                }
                break;
            }
        }
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if (bits[i] == '1') {
                result += Math.pow(2, 31 - i);
            }
        }
        return result;
    }
}