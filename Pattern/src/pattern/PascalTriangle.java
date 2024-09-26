package pattern;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N value:");
		int n=sc.nextInt();
		getPattern(n);
	}
	public static void getPattern(int n)
	{	
		for (int i = 0; i <n; i++) {
			for (int j = n; j >=i ; j--) {
				System.out.print(" ");
			}
			int num=1;
			for (int k =0; k<=i; k++) {
				System.out.print(num+" ");
					num=num*(i-k)/(k+1);
						
			}
			System.out.println();
		}
	}

}
