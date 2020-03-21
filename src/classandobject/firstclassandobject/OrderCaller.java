package classandobject.firstclassandobject;

public class OrderCaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Order orderObj1 = new Order();
		
		System.out.println(orderObj1.productId);
		System.out.println(orderObj1.orderQuantity);
		System.out.println(orderObj1.eachProductPrice);
		System.out.println(orderObj1.tax);
		System.out.println(orderObj1.deliveryPostalCode);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		orderObj1.makeAnOrderMethod();
		
		orderObj1.cancelAnOrderMethod();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		System.out.println("~~~~~~~This is second object of the order class~~~~~~");

				Order orderObj2 = new Order();
				
				//Accessing the state of the orderObj2 object
				
				System.out.println(orderObj2.productId);
				System.out.println(orderObj2.orderQuantity);
				System.out.println(orderObj2.eachProductPrice);
				System.out.println(orderObj2.tax);
				System.out.println(orderObj2.deliveryPostalCode);
				
				
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
				
				//Accessing behaviour of the class
				
				orderObj2.makeAnOrderMethod();
				orderObj2.cancelAnOrderMethod();
				orderObj2.calculateTotalOrderPriceMethod();
				
				
				
				
				
	}

}
