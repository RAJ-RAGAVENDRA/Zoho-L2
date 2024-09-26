package Array;

public class SubArray {
	public static void main(String[] args) {
		int a[] = { 1, 4, 0, 0, 3, 10, 5 };
		int n = 7;
		System.out.println(findMaxSumSub(a, n));
	}

	public static String findMaxSumSub(int a[], int n) {

		for (int i = 0; i < a.length; i++) {
			if (i < n) {
				int j = i;
				int sum = 0;
				while (j <= a.length - 1) {
					sum += a[j];
					if (sum == n) {
						return i + " to " + j;
					}
					j++;

				}
			}
		}
		return "There is no subarray with Matched sum..";
	}

}
