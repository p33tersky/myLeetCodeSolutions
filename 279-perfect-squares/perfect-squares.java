class Solution {
    public int numSquares(int n) {
        int k = 1;
        int m = 0;
        List<Integer> squares = new ArrayList<>();
        while (k < n+1){
            squares.add(k);
            m++;
            k +=2*m +1;
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