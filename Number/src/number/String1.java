package number;

public class String1 {
	public static void main(String[] args) {
		String input1 = "0123456789";
		String input2 = "3102";
		checkStep(input1, input2);
	}

	public static void checkStep(String input1, String input2) {
		int step = 0;
		int total = 0;
		
		for (int i = 0; i < input2.length(); i++) {
			step=Math.abs(input1.indexOf(input2.charAt(i))-input2.indexOf(input2.charAt(i)));
			total+=step;
		}
		System.out.println("RequiredSteps="+total);
	}

}
