package number;

import java.util.Scanner;

public class num1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A value:");
		int a=sc.nextInt();
		System.out.println("Enter B value");
		int b=sc.nextInt();
		
		for (int i = a; i <=b; i++) {
           squareNum(i); 	
           
		}
	}
	
	public static void squareNum(int n){
		for (int i = 2; i <=n; i++) {
			
			if (i*i==n){
				System.out.print(n+" ");
				break;
			}
			
		}


		
	}

}
