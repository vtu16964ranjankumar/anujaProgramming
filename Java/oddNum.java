import java.util.*;

public class oddNum {

<<<<<<< HEAD
            System.out.println("Odd number is btw 1 to "+n+":");
=======
    public static void main(String[] args) {
        int i, sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
>>>>>>> b7a3ec7d463078c16da50d5429efddb3eeef7213

        System.out.println("Odd number is btw 1 to " + n + ":9");

        for (i = 1; i <= n; i = i + 2) {
            sum = sum + i;
            System.out.println(i);
        }
        System.out.println(" sum of Odd number is btw 1 to " + n + " : " + sum);

    }
}
