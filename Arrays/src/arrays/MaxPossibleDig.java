package arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MaxPossibleDig {

	public static void main(String[] args) {
		int a[] = { 1 ,4 ,973 ,97 };
		int s=5;

		maxPossibleDigits(a,s);
	}

	public static void maxPossibleDigits(int a[],int s) {
		List<Integer> res = new ArrayList<Integer>();
		int ele = 0;
		for (int i = 0; i < a.length; i++) {
			ele = a[i];
			while (ele > 0) {
				int digit = ele % 10;
				res.add(digit);
				ele /= 10;
			}
		}
		
		
		System.out.println(res);
//---------
		for (int i = s-1,k=res.size()-1 ; i >=0; i--) {
			System.out.print(res.get(k));
			k--;
		}
	 
		

	}

}
