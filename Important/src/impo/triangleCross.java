package impo;

public class triangleCross {
	public static void main(String[] args) {
		int n=6;
		for (int i = 0; i < n; i++) {
			for (int j = 0,h=i+1; j <=n; j++) {
				if (i+j<=n-1) {
					System.out.print(h+"  ");
					h=h+n-j;
				}else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

}
