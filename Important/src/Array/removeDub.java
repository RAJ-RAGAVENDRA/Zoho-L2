package Array;

import java.util.Arrays;

public class removeDub {
	public static void main(String[] args) {
		int input[] = { 2, 3, 4, 2, 5, 3 };
		int removeCount = removeDuplicate(input);
		int result[] = new int[input.length - removeCount];
		insert(result,input);
		System.out.println(Arrays.toString(result));
	}
//----------------------------------------
	public static int removeDuplicate(int a[]) {
		int removeCount = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j] && a[i] != Integer.MAX_VALUE) {
					a[j] = Integer.MAX_VALUE;
					removeCount++;
				}
			}
		}
		return removeCount;

	}
//----------------------------------
	public static void insert(int res[],int input[])
	{
		for (int i = 0,r=0; i < input.length; i++) {
			if (input[i]!=Integer.MAX_VALUE) {
				res[r++]=input[i];
			}
		}
		
	}
}
