package pattern;

import java.util.Scanner;

public class Triangle1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a N value:");
		int n=sc.nextInt();
		getPattern(n);
		
	}
	public static void getPattern(int n)
	{
		for (int i = 0; i <n; i++) {
			int k=i+1;
			for (int j = 0; j <n; j++) {
				if (i+j<=n-1) {
					System.out.print(k+"  ");
					k=k+n-j;
				}else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
	}

}
