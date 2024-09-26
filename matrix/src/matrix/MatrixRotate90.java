package matrix;

public class MatrixRotate90 {
	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

//-----------Transpose--------------------------------
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
//-----------Reverse----------------------------------
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length / 2; j++) {
				int temp = a[i][j];
				a[i][j] = a[i][a.length - j - 1];
				a[i][a.length - j - 1] = temp;
			}
		}

		print(a);
	}
//----------------------------------------------------------
	public static void print(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
