package impo;

import java.util.Arrays;
import java.util.Iterator;

public class AppleBasket {
	public static void main(String[] args) {
		int weight[] = { 1, 1, 2, 1 };
		int threshold = 3;

		System.out.println(BasketCount(weight, threshold));
	}

	public static String BasketCount(int w[], int t) {
		int basketCount = 0;

		for (int i = 0; i < w.length; i++) {
			
			if (w[i] == t) {
				basketCount++;
			} 
			
			else if (w[i] > t) {
				return "Error";
			}
			
			else if (w[i] < t && w[i]!=0) {
				int basket = w[i];
				basketCount++;
				int r = i + 1;
				while (r < w.length) {
					if (basket + w[r] <= t) {
						basket=basket+w[r];
						w[r] = 0;
					} 
					r++;
				}
				System.out.println(basketCount);
				System.out.println(Arrays.toString(w));
			}
		}
		return "" + basketCount;
	}
}
