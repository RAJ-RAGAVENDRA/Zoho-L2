package number;

import java.util.Scanner;

public class Num3{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int input=sc.nextInt();
		
		int binary=binaryVal(input);
		
		palindrome(binary);
		
	}
	public static int binaryVal(int input) {
		int res=0;
		int pow=1;
		
		while (input>0){
			res=res+input%2*pow;
			input=input/2;
			pow*=10;
		}
		return res;
	}
	
	public static void palindrome(int bin)
	{
		int temp=bin;
		int res=0;
		
		while (temp>0){
			res=res*10+temp%10;
			temp=temp/10;
			
		}
		if (res==bin) {
			System.out.println(bin+" is a palindrome");
		} else {
		 System.out.println(bin+" is not a palindrome");
		}
		
	}
}