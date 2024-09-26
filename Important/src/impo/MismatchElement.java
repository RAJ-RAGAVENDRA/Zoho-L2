package impo;

public class MismatchElement {
	public static void main(String[] args) {
		char a[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' };
		char b[] = { 'a', 'b', 'd', 'e', 'e', 'g', 'g', 'i', 'i' };
		String key = "";
		String val = "";
		
		for (int i = 0; i < b.length; i++) {
			if (a[i] != b[i]) {
				while (a[i]!=b[i]) {
					key=key+a[i];
					val=val+b[i];
					i++;
				}
				System.out.println(key+"->"+val);
				key="";
				val="";

			}
		}
	}

}
