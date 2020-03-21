package classandobject.membermethods;

public class MemberMethodsCaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberMethods obj1 = new MemberMethods();
		
		obj1.makeAnOrderMethod();
		
		double d1 = obj1.returnTotalOrderPriceMethod();
		System.out.println(d1);
		
		String str = obj1.returnFullAddress();
		System.out.println(str);
		
		double price1 = obj1.calculatedFinalPriceAfterDisc(4.32);
		System.out.println(price1);
		
		double price2 = obj1.calcualtedFinalPriceAfterGenderDisc(4.32, 7.23);
		System.out.println(price2);
		
		
		
	}

}
