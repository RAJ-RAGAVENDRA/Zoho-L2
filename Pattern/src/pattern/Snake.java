package pattern;

import java.util.Scanner;

public class Snake {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a N value:");
		int n = sc.nextInt();
		getPattern(n);
	}

//-----------------------------------------------
	public static void getPattern(int n) {
		int iterator=0;
		int volume=1;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				iterator+=volume;
				System.out.print(iterator+" ");
			}
			iterator=iterator+n+volume;
			volume=volume*-1;
			System.out.println();
		}
	}
}
