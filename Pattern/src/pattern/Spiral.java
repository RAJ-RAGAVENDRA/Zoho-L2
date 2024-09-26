package pattern;

import java.util.Arrays;
import java.util.Scanner;

public class Spiral {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a N value:");
		int n = sc.nextInt();
		getPattern(n);
	}

//----------------Get Pattern Method---------------------------------------	
	public static void getPattern(int n) {
		int size = n * 2 - 1;
		int a[][] = new int[size][size];
		int front = 0;
		int back = size - 1;

		while (n != 0) {
			for (int i = front; i <= back; i++) {
				for (int j = front; j <= back; j++) {
					if (i==front||j==front||i==back||j==back) {
						a[i][j] = n;
					}
				}
			}
			
			++front;
			--back;
			--n;
		}
		displayPattern(a);
	}

//----------------Display Pattern----------------------------------------
	public static void displayPattern(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}

	}
}
