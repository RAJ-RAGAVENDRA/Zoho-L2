package pattern;

import java.util.Scanner;

public class DimondNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a N value:");
		int n=sc.nextInt();
		getPattern(n);
	}
	public static void getPattern(int n)
	{
		int num=1;
		for (int i = 1; i <=n; i++) {
			num=num+i-1;
			for (int j = n; j>i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print(num-- +" ");
			}
			num=num+i+1;
			System.out.println();
		}
		
		for (int i =n; i>=1; i--) {
			num=num-1;
			for (int j = n; j>i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print(num-- +" ");
			}
			num=num+1;
			System.out.println();
		}
		
		
	}

}
