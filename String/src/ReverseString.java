import java.util.ArrayList;

public class ReverseString {
	public static void main(String[] args) {
		String s1 = "This is a test String only iam ragav raj";
		String s2 = "st";
		int start = 0;
		ArrayList<String> ar = split(s1);

		for (int i = 0; i < ar.size(); i++) {
			if (checkSubstr(ar.get(i), s2)) {
				start = i;
				break;
			} 
		}
		reverse("",ar, start);

	}
//-------------------------------------------------------------
	public static void reverse(String s,ArrayList<String> ar, int start) {
		if (start==ar.size()) {
			System.out.println(s);
		}
		else {
			s=ar.get(start)+" "+s;
			reverse(s,ar,start+1);
		}

	}

//-----------------------------------------------------------
	public static Boolean checkSubstr(String s, String subs) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == subs.charAt(0) && i != s.length() - 1) {
				String ans = "";
				int j = i;
				while (j != s.length() && j != subs.length()-1) {
					ans = ans + s.charAt(j);
					j++;
					if (ans.equals(subs)) {
						return true;
					}
				}
			}
		}
		return false;

	}

//----------------------------------------------------------	
	public static ArrayList<String> split(String s) {
		ArrayList<String> ar = new ArrayList<String>();
		String word = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				word = word + s.charAt(i);
			}
			if (s.charAt(i) == ' ' || i == s.length() - 1) {
				ar.add(word);
				word = "";
			}
		}
		return ar;
	}
//------------------------------------------------------------

}
