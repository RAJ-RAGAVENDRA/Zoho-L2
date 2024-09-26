package number;

import java.util.Scanner;

public class Num13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		int num=sc.nextInt();
		System.out.println("Enter Multiple value:");
		int mul=sc.nextInt();
		System.out.println(multiply(num,mul));
		
	}
	
	public static int multiply(int num,int mul)
	{

		if (mul==0) {
		  return 0;	
		}
		if (mul>0) {
			  return num+multiply(num, mul-1);	
			}
		if (mul<0) {
			  return -multiply(num, -mul);	
			}
		return -1;
		
	}
//	int res=0;
//	for ( int i = 0; i <mul; i++) {
//		res=res+num;
//	}
//	System.out.println("multipled value:"+res);
}
