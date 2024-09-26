package impo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class OddAscEvenDec {
	public static void main(String[] args) {
		int a[] = { 5, 8, 11, 6, 2, 1, 7 };
		System.out.println("Original:" + Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("SwappedArray:" + Arrays.toString(a));

		int res[] = new int[a.length];

		for (int i = 0, j = 0, k = a.length - 1; i < a.length; i++) {

			if (a[i] % 2 != 0) {
				res[j++] = a[i];
			} else {
				res[k--] = a[i];
			}
		}

		System.out.println("Output:" + Arrays.toString(res));

	}

}
