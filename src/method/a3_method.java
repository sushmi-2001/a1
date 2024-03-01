package method;

import java.util.Scanner;

public class a3_method {
	
	int n1,n2; int add,sub,multi,div,rem;

	public static void main(String[] args) {
		a3_method r =new a3_method();
		r.input();
		r.process();
		r.output();
		
	}
	
	void input()
	{
		
		Scanner r=new Scanner(System.in);
	  System.out.print("Enter two numbers:");
	  n1=r.nextInt();
	  n2=r.nextInt();
	}
	
	void process()
	{
		add=n1+n2;
		sub=n1-n2;
		multi=n1*n2;
		div=n1/n2;
		rem=n1%n2;

	 	
	}
	
	void output()
	{
		System.out.println("sum of two numbers: "+add);
		System.out.println("sub of two numbers: "+sub);
		System.out.println("multi of two numbers: "+multi);
		System.out.println("div of two numbers: "+div);
		System.out.println("rem of two numbers: "+rem);

		
		
	}

}
