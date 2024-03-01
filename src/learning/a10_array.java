package learning;

import java.util.Scanner;

public class a10_array {
	
	public static void main(String[] args) {
		
		int size,i;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array");
		
		size = sc.nextInt();
		int a[]=new int[size];
//		a[0]=10;
//		a[1]=20;
//		a[2]=30;
//		a[3]=40;
//		a[4]=50;
//		a[5]=60;
//		
//		for(int i=0;i<5;i++)
//		{
//			
//			System.out.println(a[i]);
//		}
  
		
		for(i=0;i<size;i++)
		{
			
			a[i]=sc.nextInt();
			
			
		}
		
		System.out.print("printed array element");
		
		for(i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
	
	
	

}
