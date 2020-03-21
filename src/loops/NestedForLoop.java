package loops;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int tableNum = 2;
		 * 
		 * for(int i=1; i<=10; i++) { System.out.println(tableNum*i); }
		 */
		
		for(int tableNumLoopVar = 2; tableNumLoopVar<=3; tableNumLoopVar++){
				System.out.println("~~~~Table Number"+tableNumLoopVar);
				
			for(int innerLoopVar = 2; innerLoopVar<=4; innerLoopVar++) {
				System.out.println(tableNumLoopVar*innerLoopVar);
			}
			
			System.out.println("~~~~~~~~~~Next Table");
		}
				
	}

}
