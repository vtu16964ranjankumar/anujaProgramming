import java.util.*;

public class evenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, sum = 0;

        System.out.println("Even number upto" + n);

        for (i = 0; i <= n; i = i + 2) {

            sum = sum + i;
            System.out.println(i);
        }
        System.out.println("sum of Even number : " + sum);

    }

}
