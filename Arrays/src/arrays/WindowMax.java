package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class WindowMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a ArraySize:");
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Number:");
			int num = sc.nextInt();
			a[i] = num;
		}
		System.out.println("Enter Window Number:");
		int w = sc.nextInt();
		windowMax(a, w);
	}

	// --------------------------------------------------------------------
	public static void windowMax(int a[], int w) {
		int count=0;
		for (int i = 0; i <=a.length-w; i++) {
			int max = a[i];
			for (int j = i; j <a.length; j++) {
				if (a[j] > max) {
					max = a[j];
				}
				count++;
				if (count==w) {
					break;
				}
			}
			count=0;
			System.out.print(max + " ");
			
		}
	}

}
