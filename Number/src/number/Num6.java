package number;

import java.util.Scanner;

public class Num6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Value:");
		int a=sc.nextInt();
		System.out.println("Enter B Value:");
		int b=sc.nextInt();
		calculator(a,b);

	}
	public static void calculator(int a,int b)
	{
		System.out.println(a+" + "+b+" = "+add(a,b));
		System.out.println(a+" - "+b+" = "+sub(a,b));
		System.out.println(a+" x "+b+" = "+multi(a,b));
		System.out.println(a+" / "+b+" = "+div(a,b));
	}
	public static int add(int a,int b) 
	{
		return a+b;
		
	}
	public static int sub(int a,int b) 
	{
		return a-b;
		
	}
	public static int multi(int a,int b) 
	{
		return a*b;
		
	}
	public static int div(int a,int b) 
	{
		return a/b;
		
	}

}
