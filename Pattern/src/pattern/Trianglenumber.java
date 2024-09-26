package pattern;

import java.util.Scanner;

public class Trianglenumber {
	public static void main(String[] args) {
		int n=5;
		
		for (int i = 0; i < n; i++) {
			int k=i+1;
			for (int j = 0; j < n; j++) {
				if (i+j>=n-1) {
					System.out.print(k+" ");
					k--;
				} else {
					System.out.print("  ");

				}
			}
			System.out.println();
		}
		
	}

}
