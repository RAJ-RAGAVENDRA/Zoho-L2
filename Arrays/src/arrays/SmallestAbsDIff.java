package arrays;

public class SmallestAbsDIff {

	public static void main(String[] args) {
		int n = 4;
		int a[] = { 10, 21, 43, 56 };
		int res = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			res = findDiff(i, a, res);

		}
	}

	public static int findDiff(int i, int a[], int res) {
		for (int j = i + 1; j < a.length; j++) {
			int min = Integer.MAX_VALUE;
			int sub = Math.abs(a[i] - a[j]);
			if (sub < min && sub <= res) {
				min = sub;
				System.out.println("[" + a[i] + "," + a[j] + "]");
				res = min;
			}

		}

		return res;
	}

}
