package impo;

import java.util.Arrays;

public class leftRotate {
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5 };
		int change = 2;
		System.out.println("Input" + Arrays.toString(a));
		leftRotate(a, change);
		System.out.println("Output" + Arrays.toString(a));
	}

//---------------------------------------------------------	
	public static void leftRotate(int a[], int change) {
		for (int i = 0; i <change; i++) {
			int first=a[0];
			int j=0;
			for (j = 0; j < a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[j]=first;
		}
	  
	}
}
