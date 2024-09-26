package Array;

import java.util.Arrays;

public class Rotate {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int n=4;
		rotate(a,n);
		System.out.println(Arrays.toString(a));
	}
	public static void rotate(int a[],int n)
	{
		for (int i = 0; i < n; i++) {
			int first=a[0];
			int j=0;
			for ( j = 0; j <a.length-1; j++) {
				a[j]=a[j+1];
			}
			a[j]=first;
		}
		
	}

}
