package number;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Nth Number:");
		int n = sc.nextInt();
		int i;
		int num = 1;
		int count = 0;

		while (count < n) {
			num = num + 1;

			for (i = 2; i <= num; i++) {
				if (num % i == 0) {
					break;
				}
			}
			if (i == num) {
				count += 1;
			}
		}
		System.out.println("Given Nth number" + n + " prime Number is: " + num);
	}

}
