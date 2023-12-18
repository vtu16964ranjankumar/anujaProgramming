import java.util.*;

public class oddNum {

    public static void main(String[] args) {
        int i, sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Odd number is btw 1 to " + n + ":");

        for (i = 1; i <= n; i = i + 2) {
            sum = sum + i;
            System.out.println(i);
        }
        System.out.println(" sum of Odd number is btw 1 to " + n + " : " + sum);

    }
}
