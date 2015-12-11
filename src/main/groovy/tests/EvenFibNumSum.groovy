package tests

class EvenFibNumSum {
    public static int findingFib(int i) {
        if (i > 0 && i  < 2) {
            return 1
        }
        //finding Fibbonachi num
        int sum = 1;
        int fib1 = 1;
        int fib2 = 1;
        int evens =0;
        for (int j = 2; j < i && sum <= 4000000; j++) {
            sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = sum;
            if (sum % 2 == 0){evens += sum}
        }
        return evens;
    }
}
