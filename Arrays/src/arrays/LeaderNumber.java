package arrays;

public class LeaderNumber {

	public static void main(String[] args) {
		int a[] = { 10, 17, 4, 3, 5, 2 };
		int index = 0;
		while (index < a.length - 1) {
			index = findLeader(a, index);
		}

	}

	public static int findLeader(int a[], int index) {
		int index1 = 0;
		int leader = 0;
		for (int i = index1 + 1; i < a.length; i++) {
			if (a[i] > leader) {
				leader= a[i];
				index1 = i;
			}
		}
		System.out.print(leader + " ");
		return index1;
	}

}
