package operators;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;

		if (a == b) {
			System.out.println(" both values are same");
		} else {
			System.out.println("both are not same");
		}

		
		if (a != b) {
			System.out.println("The values are not matched");
		} else {
			System.out.println("The values matched");
		}

		
		if (a >= b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("a is smaller than b");
		}

		
		if (a <= b) {
			System.out.println("b is greater than a");
		} else {
			System.out.println("b is smaller than a");
		}
	}

}
