package pattern;

import java.util.Scanner;

public class X2 {
	
//	* * * *                    
//	 *   * 
//	  * * 
//	   * 
//	  * *                    
//	 *   * 
//	* * * * 
	


	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();
		getPattern(n);
	}

	public static void getPattern(int n) {
		for (int i = 1; i <=n; i++) {
			design(i, n);
		}
		
		for (int i = n-1; i>=1; i--) {
		   design(i,n);
		}
		
	}	
//---------------------------------------------------------------	
	public static void design(int i,int n)
	{
		for (int j = 1; j < i; j++) {
			System.out.print(" ");
		}
		for (int k = i; k <=n; k++) {
			if (k==i||k==n) {
				System.out.print("* ");
			} else {
				System.out.print("  ");
			}
		}
		System.out.println();
		
	}

}
