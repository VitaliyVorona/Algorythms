package tests

class SumSquareDiff {

    public static int squareSum(int x) {
        int sum = 0;
        for (int i = 1; i <=x; i++){
            int j = i*i;
            sum +=j;
        }
        return sum;
    }
}
