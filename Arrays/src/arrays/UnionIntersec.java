package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class UnionIntersec {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 3 };
		int b[] = { 1, 2, 7, 5 };

		getUnion(a, b); // for union we can use treeset set arraylist
		getIntersection(a, b);

	}

// ----------------------Union Method-----------   --------------------
	public static void getUnion(int a[], int b[]) {
		int res[] = new int[a.length + b.length];

		for (int i = 0, j = 0, k = 0; i < res.length; i++) {
			if (i <= a.length - 1) {
				res[i] = a[j++];
			} else {
				res[i] = b[k++];
			}
		}
		int count = 0;
		for (int i = 0; i < res.length; i++) {
			for (int j = i + 1; j < res.length; j++) {
				if (res[i] == res[j] && res[j] != Integer.MAX_VALUE) {
					res[j] = Integer.MAX_VALUE;
					count++;
				}
			}
		}
		int op[] = new int[res.length - count];
		for (int i = 0, j = 0; i < res.length; i++) {
			if (res[i] != Integer.MAX_VALUE) {
				op[j++] = res[i];
			}
		}
		System.out.println("Union: " + Arrays.toString(op));

	}

// ------------------------Intersection Method-------------------------
	public static void getIntersection(int a[], int b[]) {
		ArrayList<Integer> in = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					in.add(a[i]);
				}
			}
		}
		System.out.println("Intersection: " + in);
	}

}
