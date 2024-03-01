package learning;

import java.util.Scanner;

public class a1_if_else {
	
	
	public static void main(String[] args) {
		
		int age;
		System.out.println("Enter your age");
		Scanner sc = new Scanner(System.in);
		
		age =sc.nextInt();
		if(age>=18) {
				System.out.println("Eligible for votes...");
		}
		System.out.print("Thank you..");
		
		
	}

}
