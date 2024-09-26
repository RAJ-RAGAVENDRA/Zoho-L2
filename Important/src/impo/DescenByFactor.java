package impo;

import java.util.Arrays;

public class DescenByFactor {
	public static void main(String[] args) {
		int a[] = { 6, 12, 77 };
		int facSize[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			facSize[i] = factor(a[i]);
		}
		System.out.println(Arrays.toString(sortFact(facSize,a)));
		
	}
//------------------------------------------------------------
	public static int factor(int a) {
		int size = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				size++;
			}
		}
		return size;
	}
//-----------------------------------------------------------------
	public static int[] sortFact(int facSize[],int a[]) {
		for (int i = 0; i < facSize.length; i++) {
			for (int j = i+1; j < facSize.length; j++) {
				if (facSize[i] <facSize[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

}
