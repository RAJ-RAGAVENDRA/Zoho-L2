package pattern;

import java.util.Scanner;

public class X {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a N value:");
		String s=sc.next();
		getPattern(s);
	}
//---------------------------------------------------	
	public static void getPattern(String s)
	{
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (i==j || i+j==s.length()-1) {
					System.out.print(s.charAt(j)+" ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}
}

//P           M 
//R       A   
//  O   R     
//    G       
//  O   R     
//R       A   
//P           M 

