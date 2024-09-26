package impo;

import java.util.Arrays;

public class AnagramMatch {
	public static void main(String[] args) {
		String a[] = { "catch", "got", "tiger", "mat", "eat", "Pat", "tap", "tea" };
		String word = "ate";

		for (int i = 0; i < a.length; i++) {
			if (a[i].length()==word.length()) {
				findAnagram(a[i], word);
			}
		}
	}
//--------------------------------------------------------
	public static void findAnagram(String s, String word) {
		char[] k = s.toCharArray();
		char[] w = word.toCharArray();

		String ks = sortedString(k);
		String ws = sortedString(w);

		if (ks.equals(ws)) {
			System.out.print(s);
		}
//----------------------------------------------------------	
	}
	public static String sortedString(char k[]) {
		for (int i = 0; i < k.length; i++) {
			for (int j = 0; j < k.length; j++) {
				if (k[i] > k[j]) {
					char temp = k[i];
					k[i] = k[j];
					k[j] = temp;
				}
			}
		}
		String res = new String(k);
		return res;
	}

}
