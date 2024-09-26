package logical;

import java.util.Scanner;

public class log3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input:");
		String input = sc.next();

		System.out.println(removeUnBalance(input));
	}

	public static String removeUnBalance(String input) {
		StringBuilder result = new StringBuilder();
		int openCount = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == '(') {
				openCount++;
				result.append(ch);

			} else if (ch == ')') {
				if (openCount > 0) {
					openCount--;
					result.append(ch);
				}
			} else {
				result.append(ch);
			}

		}

		StringBuilder finalResult = new StringBuilder();
		openCount = 0;
		
		for (int i = result.length()-1; i >=0; i--) {
			char ch=input.charAt(i);
			if (ch==')'){
				openCount++;
				finalResult.append(ch);
			}
			else if (ch=='('){
				if (openCount>0) {
					openCount--;
					finalResult.append(ch);
				}
			}
			else {
				finalResult.append(ch);
			}
			
		}
   return finalResult.reverse().toString();
	}

}
