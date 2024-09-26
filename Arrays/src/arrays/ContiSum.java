package arrays;

import java.util.ArrayList;
import java.util.List;

public class ContiSum {

	public static void main(String[] args) {
		int a[] = { -2, 7, 5, -1, 3, 2, 9, -7 };
		findContSum(a);
	}

	public static void findContSum(int a[]) {
		int k = 0;
		int sum = 0;
		int maxSum = 0;
		List resArr = new ArrayList();
		resArr.add(0);
		List<Integer> res = null;

		for (int i = 0; i < a.length; i++) {
			int j;
			if (a[i] > 0) {
				res = new ArrayList<Integer>();
				for (j = i; a[j] > 0; j++) {
					sum = sum + a[j];
					res.add(a[j]);
				}
				i = j;
				if (sum > maxSum) {
					maxSum = sum;
					resArr.remove(0);
					resArr.add(res);

				}
				sum = 0;
			}

		}
		System.out.println("Sum:" + maxSum);
		System.out.println(resArr.get(0));

	}

}
