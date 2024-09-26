package impo;

import java.util.Arrays;

public class AlterSorting {
	public static void main(String[] args) {
		int []a= {1, 2, 3, 4, 5, 6, 7};
		int []ans=new int[a.length];
		arrangement(a,ans);
	}
//-----------------------------------------------------------------------	
	public static void arrangement(int a[],int ans[])
	{
		for (int i = 0,max=a.length-1,min=0; i < ans.length; i++) {
			if (i%2==0) {
				ans[i]=a[max--];
			} else {
				ans[i]=a[min++];
			}
		}
		System.out.println(Arrays.toString(ans));	
	}
}
