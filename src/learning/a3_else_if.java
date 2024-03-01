package learning;

import java.util.Scanner;

public class a3_else_if {
	
	public static void main(String[] args) {
		
		int marks;
		System.out.println("Enter marks");
		Scanner sc = new Scanner(System.in);
		marks=sc.nextInt();
		if(marks>80) {
			System.out.println("Topper");
			
		}
		
		else if(marks<80&& marks>60)
		{
			System.out.println("first");
			
		}
		else {
			
			System.out.println("second");
		}
	}

}
