import java.util.*;

public class evenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(" Even Number is:" + n);

        for (int i = 1; i <= n; i++) {
            int c = 2 * i;

            System.out.println(c);
        }

    }

}
