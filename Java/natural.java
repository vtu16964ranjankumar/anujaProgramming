import java.util.*;
public class natural{
public static void main(String []args){
    int i,sum=0;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("Natural number of 1 to "+n+":");

    for(i=1;i<=n;i++){
    
        System.out.println(i);
        sum=sum+i;
    }
    System.out.println("Sum of natural Number  is :"+sum);

}
}