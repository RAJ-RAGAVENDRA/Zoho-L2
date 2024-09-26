package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Largest Value");
		int l=sc.nextInt();
		
		System.out.println("Enter Array Size:");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Number:");
			int num=sc.nextInt();
			a[i]=num;
		}
		System.out.println("Given Input:"+Arrays.toString(a));
		 
		findLargest(a,l);
	    
	}
	public static void findLargest(int a[],int l)
	{
		int max1=a[0];
		int max2=0;
		for (int i = 1; i < a.length; i++) {
			
			if (a[i]>max1) {
			  	max2=max1;
			  	max1=a[i];
			} 
			else if (a[i]>max2){
				max2=a[i];
				
			}
			
		}
		System.out.println(max2);
	}

}
