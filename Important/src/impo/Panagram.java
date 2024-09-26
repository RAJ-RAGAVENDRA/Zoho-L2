package impo;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Panagram {
	public static void main(String[] args) {
		String s = "abcdefGhiJklmnOPQRStuvwxyz";
		char ch[] = lowerCase(s);
		sort(ch);
		System.out.println(panagram(ch));
	}

//---------------------------------------------------------------------
	public static Boolean panagram(char ch[]) {

		for (int i = 0, k = 97; i <= ch.length; k++) {
			if (ch[i] == 32) {
				System.out.println(i);
				if (ch[i] != k) {
					return false;
				}
			} else if (ch[i] == k) {
				k++;
			}
		}
		return true;
	}

//-------------------------------------------------------------------	
	public static char[] lowerCase(String s) {
		char[] c = new char[s.length()];
		for (int i = 0, j = 0; i < c.length; i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				c[j++] = (char) (s.charAt(i) + 32);

			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				c[j++] = s.charAt(i);
			}
		}
		System.out.println(Arrays.toString(c));
		return c;
	}

//-----------------------------------------------------------------
	public static void sort(char ch[]) {
		for (int i = 0; i < ch.length; i++) {
			for (int j = i; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					char t = ch[i];
					ch[i] = ch[j];
					ch[j] = t;
				}
			}
		}
		System.out.println(Arrays.toString(ch));
	}
}
