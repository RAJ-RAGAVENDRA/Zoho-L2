package number;

import java.util.Scanner;

public class Num11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A value:");
		int a = sc.nextInt();
		System.out.println("Enter B value:");
		int b = sc.nextInt();
		System.out.println("Enter C value:");
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("Maximum Number is: " + a);

		} else if (b > a && b > c) {

			System.out.println("Maximum Number is: " + b);

		} else if (c > b && c > a) {

			System.out.println("Maximum Number is: " + c);

		}

	}

}
