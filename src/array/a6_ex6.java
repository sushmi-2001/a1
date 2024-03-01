package array;

import java.util.Scanner;

public class a6_ex6 {
	
	public static void main(String[] args) {
		
		int a[]=new int[5];int sum=0;double avg;
		Scanner r=new Scanner(System.in);
		System.out.print("Enter array elements");
		for(int i=0;i<5;i++)
		{
			a[i]=r.nextInt();
		}
		System.out.print("Array elements");
		for(int i=0;i<5;i++) {
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<5;i++) {
			sum=a[i]+sum;
		}
		avg=sum/5;
		System.out.print("\n Addition"+sum+"\n Average "+avg);
	}

}
