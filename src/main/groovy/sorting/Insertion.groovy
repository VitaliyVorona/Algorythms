package sorting

class Insertion {
    //looping through the array
    public static void sort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            //comparing and inserting current value a[i] in [i-1], [i-2], [i-3], [i-4]... .
            for (int j = i; j > 0 && arr[j] < arr[j-1]; j--){
                int t = arr[j-1]
                arr[j-1] = arr[j]
                arr[j] = t
            }
        }
    }


}
