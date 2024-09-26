package number;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Num7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int input = sc.nextInt();
		List<Integer> primes=new ArrayList<Integer>();

		for (int i = 1; i <= 100; i++) {
			if (prime(i)!=0){
			// System.out.println(prime(i));
				primes.add(i);
			}
		}
		
		System.out.println(primes.get(input-1));
	}
//------------------------------------------------------------------
	public static int prime(int n) {
		//System.out.println(n);
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return n;
		}
		return 0;
	}

}
