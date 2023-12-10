import java.util.*;

public class naturalNumber {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        
        System.out.println("Input Number:"+n);
         System.out.println(" Natural number from 1 to "+ n +":");
   
               for( int i=1; i<=n; i++){
                 System.out.print( i+",");

               }
                            

        
    }
    

    
    
}
