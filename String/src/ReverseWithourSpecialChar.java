import java.util.ArrayList;

public class ReverseWithourSpecialChar {
	public static void main(String[] args) {
		String s = "ab@chan@ed";
		reverse(s);
	}

//-------------------------------Reverse Method----------------------------------------
	public static void reverse(String s) {
		char c[] = tocharArray(s);
		char res[] = new char[c.length];

		for (int i = 0; i < res.length; i++) {
			if (c[i] == '@') {
				res[i] = c[i];
			}
		}
		for (int i = c.length - 1, j = 0; i >= 0; i--) {
			if (c[i] != '@') {
				if (res[j] == '@') {
					j++;
				}
				res[j++] = c[i];
			}
		}
		System.out.println(res);

	}

//--------------------------Char Array Method-----------------------------------------
	public static char[] tocharArray(String s) {
		char c[] = new char[s.length()];

		for (int i = 0; i < c.length; i++) {
			c[i] = s.charAt(i);
		}
		return c;
	}
}
