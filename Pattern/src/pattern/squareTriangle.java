package pattern;

import java.util.Scanner;

public class squareTriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N value:");
		int n=sc.nextInt();
		getPattern(n);
	}
	public static void getPattern(int n)
	{
		for (int i = 1; i <=n; i++) {
			for (int j = i; j<=n; j++) {
				System.out.print(j+" ");
			}
			for (int k = 1; k < i; k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
	}

}
