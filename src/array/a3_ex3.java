package array;

import java.util.Scanner;

public class a3_ex3 {
	
	public static void main(String[] args) {
		
		int a[]=new int[5];
		int b[]=new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter value in first array");
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("first array element");
		for(int i=0;i<5;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("\nsecond array element");
		for(int i=0;i<5;i++) {
			b[i]=a[i];
			System.out.print(a[i]+" ");
		}
			
	}

}
