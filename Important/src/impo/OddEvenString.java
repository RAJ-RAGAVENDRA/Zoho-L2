package impo;

public class OddEvenString {
	public static void main(String[] args) {
		String s = "hacker";
		System.out.print(even(s) + " ");
		System.out.print(odd(s));
	}

//----------------_Even method--------------------------------------------
	public static String even(String s) {
		String res = "";

		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				res = res + s.charAt(i);
			}
		}
		return res;
	}

//------------------Odd Method---------------------------------------------
	public static String odd(String s) {
		String res = "";

		for (int i = 0; i < s.length(); i++) {
			if (i % 2 != 0) {
				res = res + s.charAt(i);
			}
		}
		return res;
	}
}
