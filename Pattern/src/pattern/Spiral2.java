package pattern;

import java.util.Scanner;

public class Spiral2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N value:");
		int n = sc.nextInt();
		getPattern(n);
	}

	public static void getPattern(int n) {
		int a[][] = new int[n][n];
		int front = 0;
		int back = n - 1;

		while (n != 0) {
			for (int i = front; i <= back; i++) {
				for (int j = front; j <= back; j++) {
				
						a[i][j] = n;
				
				}
				
			}
			++front;
			--back;
			--n;
		}
		display(a);
	}
	public static void display(int a[][])
	{
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}
