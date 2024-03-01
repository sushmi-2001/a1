package array;

import java.util.Scanner;

public class a2_ex2 {

	public static void main(String[] args) {

		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter elements in array");

		for (int i = 0; i < a.length; i++) {

			a[i] = sc.nextInt();
		}
		System.out.print("array elements");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("\narray reverse elements");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}

	}

}
