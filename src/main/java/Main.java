/**
 * Created by Groovy on 02-Dec-15.
 */
public class Main {
    public static void main(String[] args) {
        //hello
        System.out.println("Hello world");
        System.out.printf("The sum of sum is : %d", sum(4));

    }

    public static int sum(int x) {
        int i = 1;
        int sum = 0;
        for (; i <= x; i++){
            sum = sum + i;
        }
        return sum;
    }
}
