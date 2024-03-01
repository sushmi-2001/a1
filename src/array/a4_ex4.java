package array;
import java.util.Scanner;
public class a4_ex4 {
public static void main(String[] args) {
		
		
		
		int a[]=new int[5];int sum=0;
		Scanner r= new Scanner(System.in);
		System.out.print("Enter elements in array");
		
		for(int i=0;i<a.length;i++) {
			
			a[i]=r.nextInt();
		}
		System.out.print("Array Elements");
		
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i]+" ");
			sum=a[i]+sum;
		}
		System.out.print("\nAddition of Arrays Elements"+sum);
}
}
