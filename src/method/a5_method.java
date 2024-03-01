package method;

import java.util.Scanner;

public class a5_method {
	
	public static void main(String[] args) {
		int n;
		System.out.print("Enter any number: ");
		
		Scanner r= new Scanner(System.in);
		n=r.nextInt();
		a5_method obj = new a5_method();
		int result=obj.fact(n);
		System.out.print(n);
		System.out.print("Factorial of given number: "+result);
	}
	
	int fact(int n)
	{
		if(n==1)
			return 1;
		else
		return n*fact(n-1);
	}

}
