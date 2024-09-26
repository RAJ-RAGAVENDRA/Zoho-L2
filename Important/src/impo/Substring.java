package impo;

public class Substring {
	public static void main(String[] args) {
		String s = "abc";
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + ", ");
		}
		for (int i = 0; i < s.length();i++) {
			if (i != s.length()-1) {
				System.out.print(s.charAt(i));
				System.out.print(s.charAt(i+1) + ", ");
			}else {
				System.out.print(s.charAt(i));
				System.out.print(s.charAt(0)+", ");
			}

		}

	}
}
