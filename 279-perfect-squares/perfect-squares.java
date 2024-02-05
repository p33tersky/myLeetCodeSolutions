class Solution {
    public int numSquares(int n) {
        int sqrtNum = 0;
        int k = 0;
        List<Integer> squares = new ArrayList<>();
        for (int i = 0; i < n+1; i++) {
            if (i == sqrtNum) {
                sqrtNum = i + 2 * k + 1;
                k++;
                if (i!=0){
                    squares.add(i);
                }
            }
        }
        if (squares.size()*squares.size() == n) {
            return 1;
        }
        int result = 4;
        for (int i = 0; i < squares.size(); i++) {
            if (squares.get(i)*2==n){
                return 2;
            }
            if (squares.get(i)*3==n){
                result = 3;
            }
            for (int j = 0; j < squares.size(); j++) {
                if (squares.get(i) + squares.get(j) == n){
                    return 2;
                }
                for (int l = 0; l < squares.size(); l++) {
                    if (squares.get(i)+squares.get(j)+squares.get(l)==n){
                        result = 3;
                    }
                }
            }
        }
        return result;
    }
}