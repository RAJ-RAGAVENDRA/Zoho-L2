package matrix;

public class PathMaxSum {
	public static void main(String[] args) {
		int a[][] = { { 15, 25, 30 }, { 45, 25, 60 }, { 70, 75, 10 } };
		System.out.println("Given input:");
		print(a);
		System.out.println();

		maxSum(a);
	}

//----------print---------------------------------------	
	public static void print(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

//-------------Max Sum----------------------------------------	
	public static void maxSum(int a[][]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
				if (j==0) {
					
				}
			}
		}
	}
}
