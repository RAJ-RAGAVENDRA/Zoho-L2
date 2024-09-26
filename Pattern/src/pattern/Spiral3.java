package pattern;

import java.util.Scanner;

public class Spiral3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N Value:");
		int n=sc.nextInt();
		getPattern(n);
	}
	public static void getPattern(int n)
	{
		int size=n;
		int matrix[][]=new int[size][size];
		int minCol=0;
		int maxCol=n-1;
		int minRow=0;
		int maxRow=n-1;
		int counterValue=n*n;
		
		while (counterValue>0) {
			
			for (int i = minCol; i <=maxCol; i++)
			{
				matrix[minRow][i]=counterValue--;
			}
			for (int i = minRow+1; i <=maxCol; i++)
			{
				matrix[i][maxCol]=counterValue--;
			}
			for (int i = maxCol-1; i>=minCol; i--)
			{
				matrix[maxRow][i]=counterValue--;
			}
			for (int i = maxRow-1; i >=minRow+1; i--)
			{
				matrix[i][minCol]=counterValue--;
			}
			minCol++;
			maxCol--;
			minRow++;
			maxRow--;
		}
		
		displayPattern(matrix);
	}
	public static void displayPattern(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
