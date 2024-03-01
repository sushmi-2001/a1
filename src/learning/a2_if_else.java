package learning;

import java.util.Scanner;

public class a2_if_else {
	public static void main(String[] args) {
		
		
		
		int n;
		System.out.println("Enter any numbers..");
		Scanner sc= new Scanner(System.in);
		
		n=sc.nextInt();
		if(n>=0) {
			System.out.println("+ve number");
			
		}
		
		else {
			System.out.println("-ve number");
		}
	}

}
