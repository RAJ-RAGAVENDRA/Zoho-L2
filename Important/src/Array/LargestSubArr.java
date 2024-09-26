package Array;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class LargestSubArr {
	public static void main(String[] args) {
		int a[] = { 0, 1, 1, 0, 1, 0, 1, 1, 0, 0 };
		longestSubArr(a);
	}

	public static void longestSubArr(int a[]) {
		int zeroCount = 0;
		int oneCount = 0;
		int key = 0;
		Map<Integer, ArrayList> subarr = new TreeMap<Integer, ArrayList>();

		int j = 0;
		for (int i = 0; i < a.length; i++) {
			for (j = i; j < a.length; j++) {
				if (a[j] == 0) {
					zeroCount++;
				} else {
					oneCount++;
				}
			}
			if (zeroCount == oneCount) {
				ArrayList ar = new ArrayList();
				ar.add(i);
				ar.add(j - 1);
				subarr.put(j - i, ar);
				if (j - i > key) {
					key = j - i;
				}
			}
			zeroCount = 0;
			oneCount = 0;
		}
		System.out.println(subarr);
	}

}
