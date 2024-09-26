package arrays;

import java.util.Arrays;

public class Occurence {
	public static void main(String[] args) {
		int a[] = { 2, 3, 2, 6, 1, 6, 2 };
		Arrays.sort(a);
		occurence(a);
	}

	public static void occurence(int a[]) {
		int count = 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != Integer.MAX_VALUE) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j] && a[j] != Integer.MAX_VALUE) {
						count++;
						a[j] = Integer.MAX_VALUE;
					}
				}
				System.out.println(a[i] + "-" + count);
				count = 1;
			}

		}

	}
}