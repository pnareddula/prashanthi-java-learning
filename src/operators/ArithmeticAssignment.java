package operators;

public class ArithmeticAssignment {

	public static void main(String[] args) {
		// ArithmeticAssignment
		
		/*
		 * Use control+shift+/ to comment multiple line and control+shift+\ to uncomment
		 * lines
		 */

		// += 
		/*
		 * plus sign and equals sign has to be next to each other no spaces are accepted
		 */  

		int x = 23;
		int y = 7;
		y += x; // y=y+x
		System.out.println("done:" + y);

		// -=

		int l = 30;
		int m = 10;

		l -= m;

		// l = l-m;
		System.out.println(l);

		// *=

		int a = 20;
		int b = 10;

		b *= a;

		// b= b*a
		System.out.println(b);

		// /=

		int p = 60;
		int q = 12;

		p /= q;
		// p = p/q
		System.out.println(p);

	}
}
