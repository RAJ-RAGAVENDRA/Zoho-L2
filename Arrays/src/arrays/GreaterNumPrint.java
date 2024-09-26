package arrays;

public class GreaterNumPrint {

	public static void main(String[] args) {
		int a[] = { 3,-5,8,1 };

			findGreaterSeries(a);
	}

	public static void findGreaterSeries(int a[]){
		
		int max=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max){
				max=a[i];
				System.out.print(max+" ");
			}
		}
	}
}
