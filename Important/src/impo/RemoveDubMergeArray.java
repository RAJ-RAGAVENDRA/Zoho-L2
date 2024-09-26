package impo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDubMergeArray {
	public static void main(String[] args) {
		int a[] = { 2, 4, 5, 6, 7, 9, 10, 13 };
		int b[] = { 2, 3, 4, 5, 6, 7, 8, 9, 11, 15 };
		int[] merged = merge(a, b);
		Set<Integer> ans = removeDup(merged);
		System.out.println("Result Array"+ans);

	}

//=====================================================================================
	public static int[] merge(int a[], int b[]) {
		int[] res = new int[a.length + b.length];
		for (int i = 0, j = 0; i < a.length + b.length; i++) {
			if (i < a.length) {
				res[i] = a[i];
			} else {
				res[i] = b[j++];
			}
		}
		return res;
	}

//--------------------------------------------------------------------------------
	public static Set<Integer> removeDup(int a[]) {
		Set<Integer> res = new TreeSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j] && a[i] != Integer.MIN_VALUE) {
					a[j] = Integer.MIN_VALUE;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			if (a[i] != Integer.MIN_VALUE)
				res.add(a[i]);
		}
		return res;
	}

}
