package operators;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// &&

		int a = 10;
		int b = 15;
		int c = 5;
		
		if(a>b && a>c) {
			System.out.println("a is greatest of all");
		}
		
		if(b>a && b>c)	{
			System.out.println("b is greatest of all");
		}
		
		if(c>a && c>b) {
			System.out.println("c is greatest of all");
		}
		
		// ||
		//for char charVariable = ''  should be given within single quotes
		
		char gender = 'F';
		int s = 23;
		int age = s; 
		
	//int age = 23;
	
	if((gender == 'M' || gender == 'F') && (age>=13 && age<=19)) {
		
System.out.println("girl");
	}
	else {
		System.out.println("women");
	}
		
		
			
		}

}
