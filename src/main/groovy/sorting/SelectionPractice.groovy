package sorting


class SelectionPractice {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int m = i;
            int j
            for (j = i+1; j < arr.length; j++){
                if (arr[j] < arr[m]){m=j}
            }
            int t = arr[i]
            arr[i]=arr[m]
            arr[m] = t
        }
    }

}
