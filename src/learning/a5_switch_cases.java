package learning;

import java.util.Scanner;

public class a5_switch_cases {
	
	
	public static void main(String[] args) {
		
		
		int a=10,b=20,ch;
		System.out.print("Enter user choice..!\n");
		Scanner sc = new Scanner(System.in);
	   ch= sc.nextInt();
		
		switch(ch)
		{
		case 1:System.out.print("Sum"+(a+b));
			break;
		case 2:System.out.print("minus"+(a-b));
			break;
		case 3:System.out.print("multi"+(a*b));
			break;
		case 4:System.out.print("division"+(a/b));
		break;
		default: System.out.print("invalid choice..");
		}
		
		
		
		
		
	}
	
	
	

}
