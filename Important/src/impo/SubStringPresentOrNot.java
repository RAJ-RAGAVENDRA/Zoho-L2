package impo;

public class SubStringPresentOrNot {
	public static void main(String[] args) {
		String s1 = "test12S1234";
		String s2 = "123";
		int output = checkSubStrIndex(s1, s2);
		System.out.println("Index->"+output);
	}
//----------------------------------------------------------------
	public static int checkSubStrIndex(String s1, String s2) {
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == s2.charAt(0)) {
				String ans = "";
				int j = i;
				
				while (j != s1.length() && j!=s2.length()) {
					ans += s1.charAt(j);
					j++;
					if (ans.equals(s2)) {
						return i;
					}
				}
				i=i+s2.length()-1;
			
			}
		}
		return -1;
	}

}
