package method;

public class a4_recursion {
	
	
	public static void main(String[] args) {
		
		a4_recursion r= new a4_recursion();
		int a=r.sum(3);
		System.out.print("sum first N natural number "+a);
	}
	int sum(int b)
	{
		if(b>0)
		{
		  return b+sum(b-1);
		}
		else
		{
			return 0;
		}
	}

}
