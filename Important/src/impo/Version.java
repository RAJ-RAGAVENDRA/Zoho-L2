package impo;

public class Version {
	public static void main(String[] args) {
		String s1 = "Version1 1.8.4";
		String s2 = "Version2 4.8.2";
		String op="";

		for (int i = 9; i < s1.length(); i=i+2) {
			if (s1.charAt(i) == s2.charAt(i)) {
				op="Equal";
				continue;
			} else if (s1.charAt(i) != s2.charAt(i)) {
				if (s1.charAt(i) > s2.charAt(i)) {
					op="Downgraded";
					break;
				} else {
					op="Upgraded";
					break;
				}
			} 
		}
	System.out.println(op);
	}
	

}
