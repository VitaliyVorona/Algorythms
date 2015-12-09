package sorting

class Selection {
    public static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i

            for (int j = i + 1; j < a.length; j++) {
                if (less(a[j], a[min])){min = j}
            }
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
