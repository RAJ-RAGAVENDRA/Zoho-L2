package arrays;

import java.util.Scanner;

public class findIndexOfArr {

	public static void main(String[] args) {
		int a[]= {8,7,4,5,6,-7};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		findIndex(a,n);

	}
	public static void findIndex(int a[],int n)
	{
		for (int i = 0; i < a.length; i++) {
			if (a[i]==n){
				System.out.println(i);
				return;
			} 
		}
	}

}
