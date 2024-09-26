package number;

import java.util.Scanner;

public class Num14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Input:");
		int input = sc.nextInt();
		count(input);
	}

	public static void count(int input) {
		int resCount = 0;
		for (int i = 1; i <= input; i++) {

			int temp = i;
			int tlen = 0;
			while (temp > 0) {
				tlen++;
				temp /= 10;
			}
			resCount += tlen;

		}
		System.out.println(resCount);

	}

}
