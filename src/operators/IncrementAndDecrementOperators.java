package operators;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ++

		// If increment operators are not assigned to a variable then X++ and ++X
		// behaves similarly

		int l = 5;
		// l = l+1

		l++;
		System.out.println(l);

		// l=l-1
		l--;
		System.out.println(l);

		// If increment operators are assigned to a variable then X++ and ++X behave
		// differently

		// ++X, X++
		System.out.println("===================");

		int x = 23;

		int m;

		m = ++x;

		System.out.println(m);

		// --X, X--
		System.out.println("================");

		int y = 23;
		int n;

		n = y--;
		System.out.println(n);

	}

}
