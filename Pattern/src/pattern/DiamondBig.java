package pattern;

import java.util.Scanner;

public class DiamondBig {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		getPattern(n);
	}

	public static void getPattern(int n) {

		for (int i = 0; i <n; i++) {
			char r = (char) ('a' + n);

			for (int j = n; j > i; j--) {
				System.out.print("  ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(--r + " ");
			}

			for (int k = 0; k < i; k++) {
				System.out.print(++r + " ");
			}
			System.out.println();
		}

		for (int i = n - 2; i >= 0; i--) {

			char r = (char) ('a' + n);

			for (int j = n; j > i; j--) {
				System.out.print("  ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(--r + " ");
			}

			for (int k = 0; k < i; k++) {
				System.out.print(++r + " ");
			}
			System.out.println();
		}
	}

}
