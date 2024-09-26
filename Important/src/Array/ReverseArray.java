package Array;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		reverse(a);
		System.out.println(Arrays.toString(a));
	}
	public static void reverse(int a[])
	{   int n=a.length;
		for (int i = 0,j=n-1; i < a.length/2; i++,j--) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
		}
		
	}

}
