package arrays;

public class TwoNumSumChecVal {

	public static void main(String[] args) {
		int a[] = { 8, 3, 4, 7, 9 };
		int n = 7;
		findCombination(a, n);
	}

	public static void findCombination(int a[], int n) {
		for (int i = 0; i < a.length; i++) {

			if (a[i] == n) {
				System.out.println(a[i]);
				continue;
			} else if (a[i] < n) {
				for (int j = i + 1; j < a.length; j++) {
					int sum = 0;
					if (a[j] < n) {
						sum = a[i] + a[j];
						if (sum == n) {
							System.out.println(a[i] + "," + a[j]);
						}
					}
				}

			} else if (a[i] > n) {
				continue;
			}
		}

	}

}
