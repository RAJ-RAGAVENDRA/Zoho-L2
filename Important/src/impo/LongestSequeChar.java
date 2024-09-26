package impo;

public class LongestSequeChar {
	public static void main(String[] args) {
		String s = "abcccabcdcd";
		int res = findLongestSequence(s);
		System.out.println("Output:"+res);
	}
//------------------------------------------------------------
	public static int findLongestSequence(String s) {
		int count = 0;
		int maxcount=0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = s.length() - 1; j > i; j--) {
				if (s.charAt(i) == s.charAt(j)) {
					for (int k = i; k < j - 1; k++) {
						count++;
					}
					if (count>maxcount) {
						maxcount=count;
					}
					count=0;
				}
			}
		}
		return maxcount;
	}

}
