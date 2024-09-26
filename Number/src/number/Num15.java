package number;

import java.util.Scanner;

public class Num15 {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a Number:");
      int input=sc.nextInt();
      System.out.println(checkStepNumber(input));
      
	}
//-----------------------------------------------------
	public static String checkStepNumber(int input)
	{
		while (input<9){
			int digit=input%10;
			int step1=digit+1;
			int step2=digit-1;
			input/=10;
			int near=input%10;
			if (near!=step1 && near!=step2) {
				System.out.println(input);
				System.out.println(near);
				System.out.println(step1);
				System.out.println(step2);
				return "No";
			}
		}
		return "Yes";
	}
	

}
