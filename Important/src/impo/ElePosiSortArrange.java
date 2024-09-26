package impo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElePosiSortArrange {
	public static void main(String[] args) {
		int a[] = { 4, 2, 13, 15, 12, 10, 5 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 2; j < a.length; j = j + 2) {
				if (i % 2 == 0) {
					if (a[i] < a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				} else {
					if (a[i] > a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}
		System.out.println("output"+Arrays.toString(a));
	}

}
