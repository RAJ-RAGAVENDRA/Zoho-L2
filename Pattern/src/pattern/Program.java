package pattern;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a N value:");
		String input = sc.next();
		getPattern(input);
	}
//------------------------------------------------------------
	public static void getPattern(String s) {
		String halfStr = halfSubstr(s);
		for (int i = 1; i <=s.length(); i++) {

			for (int j = s.length()-1; j >= i; j--) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(halfStr.charAt(k-1)+" ");
			}
			System.out.println();
		}
	}

//-----------------------------------------------------------------------------------	
	public static String halfSubstr(String s) {
		String half = "";
		for (int i = s.length() / 2; i < s.length(); i++) {
			half += s.charAt(i);
		}
		for (int i = 0; i < s.length() / 2; i++) {
			half += s.charAt(i);
		}
		return half;
	}
}
