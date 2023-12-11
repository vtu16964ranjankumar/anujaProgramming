import java.util.*;
public class alphabets {
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);

    for(ch=ch; ch<='z'; ch++){
        System.out.print(ch+",");
    }
    
    }
}

