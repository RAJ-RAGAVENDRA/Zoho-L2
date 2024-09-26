package pattern;

import java.util.Scanner;

public class RightTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a N value:");
		int n = sc.nextInt();
		getPattern(n);
	}

//-------------get Pattern-------------------------------
	public static void getPattern(int n) {
		for (int i = 1; i <= n; i++) {
			int k = i;
			for (int j = 1; j <= n; j++) {
				if (i >= j) {
					System.out.print(k + " ");
					k = k + n - j;
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
