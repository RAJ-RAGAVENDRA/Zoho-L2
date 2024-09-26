package number;

import java.util.Scanner;

public class Num12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		long input = sc.nextLong();
		evenOddCount(input);
	}

//-----------------Finding the Even and Odd Count in the given Number--------------
	public static void evenOddCount(long input) {
		int odd = 0;
		int even = 0;

		while (input > 0) {
			long digit = input % 10;
			if (digit % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			input/=10;

		}
		System.out.println("Odd Count= "+odd);
		System.out.println("Even Count= "+even);
	}

}
