import java.util.*;
public class biharMatric {
	public static void main( String []args){
		Scanner sc = new Scanner(System.in);

		int Rollno = sc.nextInt();
		String Name = sc.next();
		int Marks1  = sc.nextInt();
		int Marks2 = sc.nextInt();
		int Marks3 = sc.nextInt();
		int Marks4 = sc.nextInt();
		int Marks5 = sc.nextInt();


        System.out.println("Roll NO: "+Rollno);
        System.out.println("Name of Student: "+Name);
        System.out.println("Marks in Physics");
        System.out.println("Marks in Chemistry");
        System.out.println("Marks in Math");
        System.out.println("Marks in Hindi");
        System.out.println("Marks in Sanskrit");

        int Totalmarks = (Marks1 + Marks2 + Marks3 + Marks4 + Marks5 );
        System.out.println("Marks obtained ="+Totalmarks+"Full Marks 500");
        

        
	
		if(Totalmarks>=300 && Totalmarks<=500){
			System.out.println("First Division");
			 float percentage = (Totalmarks/5);
			 System.out.println(percentage);

		} else if(Totalmarks>=225 && Totalmarks<=299){
			System.out.println("Second Division");
			 float percentage = (Totalmarks/5);
			 System.out.println(percentage);

		} else if(Totalmarks>=130 && Totalmarks<=224){
			System.out.println("Third Division");
			 float percentage = (Totalmarks/5);
			 System.out.println(percentage);

		}else {
			System.out.println("Fail Division");
			 float percentage = (Totalmarks/5);
			 System.out.println(percentage);
		}


	}
}


