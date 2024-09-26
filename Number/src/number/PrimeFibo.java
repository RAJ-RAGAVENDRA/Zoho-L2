package number;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PrimeFibo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter START END LIMIT");
		int start=sc.nextInt();
		int end=sc.nextInt();
		int limit=sc.nextInt();
		
		ArrayList<Integer> rs=new ArrayList();
		
		fibo(start,end,rs);
		
		checkLimit(limit,rs);
		
	}
//---------------------------------------------------------------	
	public static void prime(int n, ArrayList<Integer> rs)
	{
		int count=0;
		for (int i = 1; i <=n; i++) {
			if (n%i==0){
				count++;
			}
		}
		if (count==2) {
			rs.add(n);
		}
		
	}
//---------------------------------------------------------------
	public static void fibo(int start,int end,ArrayList<Integer>rs)
	{
		int a=1;
		int b=0;
		int sum=0;
		
		while (b<=end) {
			prime(b,rs);
			sum=a+b;
			a=b;
			b=sum;
			
		}
	}
//------------------------------------------------------------------
	public static void checkLimit(int limit, ArrayList<Integer> rs)
	{	int op = 0;
		for (int i = 0; i < rs.size(); i++) {
			op=op+rs.get(i);
		}
		if (limit<op) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
