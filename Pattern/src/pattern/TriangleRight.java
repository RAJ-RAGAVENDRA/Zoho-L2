package pattern;

import java.util.Scanner;

public class TriangleRight {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N value:");
		int n=sc.nextInt();
		getPattern(n);
		}
	public static void getPattern(int n)
	{	
		int odd=1;
		int even=2;
		
		for (int i = 1; i<=n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("  ");
			}
			for (int k = 1; k <=i; k++) {
				if (i%2!=0) {
					System.out.print(odd+" ");
					odd+=2;
				} else {
					System.out.print(even+" ");
					even+=2;
				}
			}
			System.out.println();
		}
		
		
	}

}
