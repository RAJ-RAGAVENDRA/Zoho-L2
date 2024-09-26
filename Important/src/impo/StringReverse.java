package impo;

import java.util.ArrayList;

public class StringReverse {
	public static void main(String[] args) {
		String s = "Sarah loves Ragav";
		ArrayList<String>arr = split(s);
		System.out.println(arr);
		recursion(" ", arr, 0);
	}

	public static void recursion(String s, ArrayList<String> arr, int i) {

		if (i == arr.size()) {
			System.out.println(s);
		} else {
			s = arr.get(i) + " " + s;
			recursion(s, arr, i + 1);
		}

	}
	public static ArrayList<String> split(String s)
	{	
		ArrayList<String>arr=new ArrayList<String>();
		String word="";
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)!=' ') {
				word=word+s.charAt(i);
			}
			if (s.charAt(i)==' ' || i==s.length()-1) {
				arr.add(word);
				word="";
			}	
		}
		return arr;
	}

}
