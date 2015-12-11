package sorting

class Selection {
    public static void sort(int[] a) {
        //going through array
        for (int i = 0; i < a.length; i++) {
            int min = i
        //inner loop for comparing the the very first value of an array with all the consecutive
        // finding the smallest value
            for (int j = i + 1; j < a.length; j++) {
                if (less(a[j], a[min])){min = j}
            }
        //swapping smallest value with the very first one
            exch(a, i, min)
        }
    }

    public static boolean less(int i, int j) {
        return i.compareTo(j) < 0
    }

    public static void exch(int[] a, int i , int j) {
        int temp = a[i]
        a[i] = a[j]
        a[j] = temp
    }
}
