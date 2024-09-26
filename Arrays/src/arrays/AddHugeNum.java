package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AddHugeNum {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter a Array Number of Digits:");
		int aSize = sc.nextInt();

		System.out.println("Enter b Array Number of Digits");
		int bSize = sc.nextInt();

		int max1 = aSize > bSize ? aSize : bSize;
		int max2 = aSize < bSize ? aSize : bSize;

		int a[] = new int[max1];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter A array Number");
			int n = sc.nextInt();
			a[i] = n;
		}

		int b[] = new int[max2];

		for (int i = 0; i < b.length; i++) {
			System.out.println("Enter b array Number");
			int n = sc.nextInt();
			b[i] = n;
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		sumArray(a, b, max1, max2);
	}

//=========================================================================
	public static void sumArray(int a[], int b[], int max1, int max2) {
		int add = 0;
		int[] sum = new int[max1];

		for (int i = max1 - 1, j = max2 - 1; i >= 0; i--, j--) {

			int num1 = (i >= 0) ? a[i] : 0;
			int num2 = (j >= 0) ? b[j] : 0;
			
			add = add + num1 + num2;
			sum[i] = add % 10;
			add /= 10;
		}
		System.out.println(Arrays.toString(sum));

	}

}
