package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DuplRemov {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Number:");
			int num=sc.nextInt();
			a[i]=num;
		}
		System.out.println("Given Input:"+Arrays.toString(a));
		dubRemove(a);
	}
	public static void dubRemove(int a[])
	{
		int count=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j] && a[j]!=Integer.MAX_VALUE ){
					a[j]=Integer.MAX_VALUE;
					count++;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
		int res[]=new int[a.length-count];
		for (int i=0,j=0; i < a.length; i++) {
			if (a[i]!=Integer.MAX_VALUE) {
				res[j++]=a[i];
			}
		}
		System.out.println(Arrays.toString(res));
	}

}
