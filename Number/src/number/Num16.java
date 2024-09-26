package number;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Num16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1:");
		int n1 = sc.nextInt();
		System.out.println("Enter num1:");
		int n2 = sc.nextInt();
		System.out.println("Enter Nth value");
		int input = sc.nextInt();
		numSys(n1, n2, input);
	}

	public static void numSys(int n1, int n2, int input) {
		List<Integer> sys = new ArrayList<Integer>();
		for (int i = 1; i < 1000; i++) {
			int temp = i;
			while (temp > 0) {
				if (temp % 10 == n1 || temp % 10 == n2) {
					temp /= 10;
					if (temp == 0) {
						System.out.print(i+" ");
						sys.add(i);
					}
				} else
					break;

			}

		}
       System.out.println("Given Nth value's number: "+sys.get(input-1));
	}

}
