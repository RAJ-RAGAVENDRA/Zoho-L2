package number;

import java.util.Scanner;

public class Num4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int input=sc.nextInt();
	    int res=nextPalindrome(input); 
	    System.out.println(res);
	}
	
	public static int nextPalindrome(int input) 
	{
		while (input>0){
			input--;
			//System.out.println(input);
			int res=0;
			int temp=input;
			while (temp>0){
				res=res*10+temp%10;
				temp=temp/10;
			}
				if (input==res){
					return input;
					
				}
				res=0;
				
			}
		return 0;
			
	}
	
		
}


