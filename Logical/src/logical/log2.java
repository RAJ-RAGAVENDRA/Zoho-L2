package logical;

import java.util.Scanner;
import java.util.Stack;

public class log2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Paranthesis String:");
		String input = sc.next();

		if (balanceCheck(input)) {
			System.out.println("Given input is Balanced");

		} else {
			System.out.println("Given input is Not Balanced");
		}

	}

	// -----------Balance checking Method----------------------

	public static boolean balanceCheck(String input) {
		Stack<Character> s = new Stack<Character>();
		
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '[' || input.charAt(i) == '{' || input.charAt(i) == '(') {
				s.push(input.charAt(i));
				continue;
			}
			if (s.isEmpty()) {
				return false;
			}

			char check;
			switch (input.charAt(i)) {
			case ')':
				check = s.pop();
				if (check == '{' || check == '[') {
					return false;
				}
				break;
			case '}':
				check = s.pop();
				if (check == '(' || check == '[') {
					return false;
				}
				break;
			case ']':
				check = s.pop();
				if (check == '(' || check == '{') {
					return false;
				}
				break;

			}
		}
		return (s.isEmpty());
	}

}