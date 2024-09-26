import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Substr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String s = sc.next();
		String s1 = sc.next();
		getSubStr(s);
		getSubStr(s1);
		// xyzwyyxyzw
		// abcabcadef
	}

//-----------------------------------------------
	public static void getSubStr(String s) {
		Map<Integer, String>res=new TreeMap<Integer, String>();
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
						String substr = checksub(s, i, j);//----------------->get repeated substr
						res.put(substr.length(), substr);
				}
			}
		}
		System.out.println(res.get(res.size()));
	}

//------------------------------------------------
	public static String checksub(String s, int a, int b) {
		String substr = "";
		int end=b;

		while ((a <end && b < s.length()) && s.charAt(a) == s.charAt(b)) {
			substr += s.charAt(b);
			a++;
			b++;
		}
		
		return substr;
	}

}
