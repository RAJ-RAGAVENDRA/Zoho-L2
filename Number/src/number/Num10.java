package number;

public class Num10 {

	public static void main(String[] args) {
		int a[] = { 2, 10, 4, 8 };

		for (int i = 0; i < a.length; i++) {

			if (fibonaciDigit(a[i]) != 0) {
				System.out.print(a[i] + " ");
			}
		}
	}

	public static int fibonaciDigit(int input) {
		int temp = input;
		int a = 1;
		int b = 0;
		int sum = 0;
		int n = 10;

		while (n > 0) {
			sum = a + b;
			a = b;
			b = sum;
			// System.out.println(b);
			n--;
			if (sum == temp) {
				return sum;
			}
		}
		return 0;
	}

}
