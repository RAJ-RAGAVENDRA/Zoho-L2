package number;

import java.util.Scanner;

public class Num8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Digit:");
		int addingDigit=sc.nextInt();
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		System.out.println("Digits after Added "+addDigits(addingDigit,n));
		
	}
	public static int addDigits(int addingDigit,int n)
	{
		int res=0;
		int place=1;
		int tempRes=0;
		int tempPlace=1;
		
		while (n>0){
			int digit=n%10;
			digit+=addingDigit;
			
			while (digit>0){
				tempRes=tempRes+(digit%10)*tempPlace;
				tempPlace*=10;
				digit/=10;
			}
			res=res+tempRes*place;
			place*=tempPlace;
			tempPlace=1;
			tempRes=0;
			n/=10;
		}
		return res;
	}

}
