package arrays;

import java.util.Arrays;

public class PosNegNeu {

	public static void main(String[] args) {
		int a[] = { 2, 1, 0, -8, -9 };

		getResArray(a);
	}

	public static void getResArray(int a[]) {
		float[] res = new float[3];
		float neu = 0;
		float pos = 0;
		float neg = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] == 0) {
				neu++;
			} else if (a[i] > 0) {
				pos++;
			} else if (a[i] < 0) {
				neg++;
			}
		}
		pos = pos / a.length;
		neu = neu / a.length;
		neg = neg / a.length;

		res[0] = pos;
		res[1] = neu;
		res[2] = neg;

		System.out.println(Arrays.toString(res));

	}
}
