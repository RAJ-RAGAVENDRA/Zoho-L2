package matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class summa {
	static int ballweight = 6;
	static int count = 0;
	
	public static void main(String[] args) {
		List<Integer> balls = new ArrayList<Integer>(Arrays.asList(6, 6, 6, 5, 6, 6, 6, 6, 6, 6, 6, 6,6));
		List<Integer> set1 = new ArrayList<Integer>();
		List<Integer> set2 = new ArrayList<Integer>();

		while (true) {
			set1 = balls.subList(0, balls.size() / 2);
			set2 = balls.subList(balls.size() / 2, balls.size());

			System.out.println("Set1:" + set1);
			System.out.println("Set2:" + set2);

			List<Integer> bigset = set1.size() >= set2.size() ? set1 : set2;
			List<Integer> smallset = set1.size() >= set2.size() ? set2 : set1;
//-------------------------------------------------------------------------------------------------
			if (isDefective(bigset)) {
				if (bigset.size() == 2) {
					System.out.println();
					System.out.println("Defective: " + (bigset.get(0) > bigset.get(1) ? bigset.get(1) : bigset.get(0)));
					System.out.println("Times: " + count);
					break;
				}
			  balls = bigset;
			} else {
				if (smallset.size() == 1) {
					System.out.println();
					System.out.println("Defective: " + smallset.get(0));
					System.out.println("Times: " + count);
					break;
				}
			 balls = smallset;
			}
			System.out.println("Balls" + balls);
			System.out.println("Times:" + count);
			System.out.println();
		}
	}

//------------------------------------------------------------------------------------------
	public static boolean isDefective(List set) {
		int weight = calculateWeight(set);
		return !(weight % ballweight == 0);
	}
//-------------------------------------------------------------------------------------------	
	public static int calculateWeight(List<Integer> set) {
		count++;
		int sum = 0;
		for (int i = 0; i < set.size(); i++) {
			sum += set.get(i);
		}
		return sum;
	}
//---------------------------------------------------------------------

}
