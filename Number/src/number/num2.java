package number;

import java.util.Scanner;

public class num2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Input:");
		
		int input=sc.nextInt();
		System.out.println("output:"+findNthNumber(input));
	
	}

    public static int findNthNumber(int n) {
        n--; // Convert to 0-based index
        int result = 0;
        int base = 1;

        while (n >= 0) {
            int remainder = n % 2;
            if (remainder == 0) {
                result += 3 * base;
            } else {
                result += 4 * base;
            }
            n = (n - remainder) / 2;
            base *= 10;
        }

        return result;
    }
}
