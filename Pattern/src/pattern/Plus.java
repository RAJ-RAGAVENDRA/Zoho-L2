package pattern;

import java.util.Scanner;

public class Plus {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		getPattern(s);
	}
	public static void getPattern(String s)
	{
		
	 for (int i = 0; i <s.length(); i++) {
		if (i==s.length()/2) {
			for (int j = 0; j < s.length(); j++) {
				System.out.print(s.charAt(j)+" ");
			}
			System.out.println();
		}else
		{
			for (int j = 0; j < s.length(); j++) {
				if (j==s.length()/2) {
					System.out.print(s.charAt(i)+" ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
		
	}

}
