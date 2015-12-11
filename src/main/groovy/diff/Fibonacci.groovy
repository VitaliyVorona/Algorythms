package diff

class Fibonacci {
    //fibonnacci range

    public static int fibonacci(int x) {
        int i = 1;
        int j = 1;
        int sum = 0;

        if (x > 0 && x <= 2) {
            return x
        }
        for (int n = 3; n <=  x; n++) {
            sum = i + j;
            i = j;
            j = sum;
        }
        return sum
    }
}
