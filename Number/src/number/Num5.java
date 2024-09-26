package number;

import java.util.Scanner;

public class Num5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a input:");
		int input = sc.nextInt();
		int checkedPrime = checkPrime(input);
		if (checkedPrime != 0) {
			System.out.println(checkedPrime + " is primeNumber");
			rev(checkedPrime);
		} else {
			System.out.println();
			System.out.println(input + " Not a PrimeNumber");
		}

	}

//-----------------------Check the given is prime or not-------------------------------
	public static int checkPrime(int input) {
		for (int i = 2; i < input; i++) {
			if (input % i == 0) {
				return 0;
			}
		}
		return input;

	}

// ------------------------Check the given reverse number is prime or not------------------------------------
	public static void rev(int input) {
		int temp = input;
		int res = 0;
		while (temp > 0) {
			res = res * 10 + temp % 10;
			temp = temp / 10;
		}
		System.out.println(checkPrime(res) + " is also Prime");

	}

}
