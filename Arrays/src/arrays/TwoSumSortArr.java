package arrays;

public class TwoSumSortArr {

	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 8, 10 };
		int n = 7;
		boolean output = findSum(a, n);
		System.out.println(output);
	}

	public static boolean findSum(int a[], int n) {
		int end = a.length;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < end; j++) {
				if (a[i] < n) {
					if (a[j] < n) {
						int sum = a[i] + a[j];
						if (sum == n) {
							return true;
						}
					} else if (a[j] > n) {
						end = j;
					}

				}
			}
		}

		return false;
	}
}
