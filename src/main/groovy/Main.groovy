import diff.Fibonacci
import tests.EvenFibNumSum
import tests.SumSquareDiff

/**
 * Created by vitaliy.vorona on 12/7/2015.
 */
class Main {
    public static void main(String[] args) {
       /* int[] arr = [3,22,1,10,5,4] as int[]
        int[] arrS

        Insertion s = new Insertion()
        s.sort(arr)
        for (int i : arr){
            println i
        }*/

        SumSquareDiff ssd = new SumSquareDiff();
        println ssd.squareSum(10);
    }
}
