package array;

import java.util.Scanner;

public class a5_ex5 {

	
	public static void main(String[] args) {
		
		int a[]=new int[5];int n,count=0;
		Scanner r= new Scanner(System.in);
		System.out.print("Enter element in array");
		for(int i=0;i<a.length;i++) {
			a[i]=r.nextInt();
		}
		System.out.print("Array element");
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i]);
		}
		System.out.print("Enter search elements");
		n=r.nextInt();
		for(int i=0;i<a.length;i++) {
			if (a[i]==n) 
			{
				count++;
			}
		}
			if (count>0) 
				System.out.print("item found"+count+"times");
			
			else 
				System.out.print("item not found");
			
		}
		
	
}
