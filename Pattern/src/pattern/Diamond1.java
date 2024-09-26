package pattern;

import java.util.Scanner;

public class Diamond1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a N value:");
		int n = sc.nextInt();
		getPattern(n);
	}

	public static void getPattern(int n) {
		for (int i = 1; i <= n; i++) {

			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				if (k == 1 || k == i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		for (int i = n-1; i >= 1; i--) {
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				if (k == 1 || k == i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

	
	
//	5
//    * 
//   * * 
//  *   * 
// *     * 
//*       * 
// *     * 
//  *   * 
//   * * 
 //   * 
}
