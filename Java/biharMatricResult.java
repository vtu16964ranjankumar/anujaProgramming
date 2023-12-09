import java.util.*;
public class biharMatricResult {
	public static void main( String []args){
		Scanner sc = new Scanner(System.in);

		int Rollno = sc.nextInt();
		String Name = sc.next();

		System.out.println("Marks in Physics");
		int Marks1  = sc.nextInt();
		
		System.out.println("Marks in Chemistry");
		int Marks2 = sc.nextInt();

		System.out.println("Marks in Mathematics");
		int Marks3 = sc.nextInt();

		System.out.println("Marks in Hindi");
		int Marks4 = sc.nextInt();

		System.out.println("Marks in Sanskrit");
		int Marks5 = sc.nextInt();

		System.out.println("Total marks");
		int Totalmarks = ( Marks1 + Marks2 + Marks3 + Marks4 + Marks5);

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


