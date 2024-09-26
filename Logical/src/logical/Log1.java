package logical;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Log1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a[][] = { { "ram", "syam" }, { "akil", "syam" }, { "nikil", "ram" }, { "subash", "ram" },
				{ "karthik", "akil" } };

		System.out.println("Enter String:");
		String input = sc.next();

		List<String> child = findChild(input, a);
		System.out.println(input + " Child is:" + child);

		List<String> grandChild = findGranChild(child, a);
		System.out.println("GrandChildren" + grandChild);

	}

//----------------Finding a Child by Given Father Name-----------------------------
	public static List<String> findChild(String input, String a[][]) {
		List<String> childs = new ArrayList<String>();
		for (int i = 0; i < a.length; i++) {
			if (a[i][1].equals(input)) {
				childs.add(a[i][0]);
			}

		}
		return childs;
	}

//---------------Finding a GrandChild by Child Name-------------------------------	
	public static List<String> findGranChild(List<String> childs, String a[][]) {
		List<String> granChild = new ArrayList<String>();

		for (String s : childs) {

			for (int i = 0; i < a.length; i++) {
				if (a[i][1].equals(s)) {

					granChild.add(a[i][0]);

				}

			}

		}
		return granChild;
	}
}
