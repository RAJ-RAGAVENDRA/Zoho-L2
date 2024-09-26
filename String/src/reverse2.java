import java.util.Arrays;

public class reverse2 {
	public static void main(String[] args) {
		String s = "house no : 123@ cbe";
		reverse(s);
	}

//------------------reverse Method------------------------------------------	
	public static void reverse(String s) {
		char[] c = toChar(s);
		char[] res = new char[c.length];
		System.out.println(c);
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '@' || c[i] == ':') {
				res[i] = c[i];
			}
			if (c[i] == ' ') {
				res[i]='_';
			}
		}

		for (int i =c.length-1, j =0; i >=0; i--) {
			if (c[i] >= 97 && c[i] <= 122 || c[i] >= 48 && c[i] <= 57) {
				if (res[j] == '_' || res[j] == '@' || res[j] == ':') {
					while(res[j] == '_' || res[j] == '@' || res[j] == ':')
					{
					j++;	
					}
				}
				res[j++] = c[i];		
			}
		}
		
		for (int i = 0; i < res.length; i++) {
			if (res[i]=='_') {
				res[i]=' ';
			}
		}
		System.out.println(res);
	}

//-------------------Char Array-----------------------------------------------------	
	public static char[] toChar(String s) {
		char[] c = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);
		}
		return c;
	}
}



