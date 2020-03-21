package classandobject.constructorpackage;


public class OrderClassWithConstructorCaller {
	
	public static void main(String[] args) {

	
	// 1  Main Method

		
		
	// Create Object of the class	
		
		OrderClassWithConstructor obj1 = new OrderClassWithConstructor();
		
	// Accessing member variables
		
		System.out.println(obj1.orderId);
		System.out.println(obj1.productId);
		System.out.println(obj1.orderQuantity);
		System.out.println(obj1.eachProductPrice);
		System.out.println(obj1.tax);
		System.out.println(obj1.deliveryPostalCode);
		System.out.println(obj1.orderTimeStamp);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
	//Accessing member methods
		
		obj1.makeAnOrderMethod();
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		//Creating Object (second one) of the class
		
		OrderClassWithConstructor obj2 = new OrderClassWithConstructor();
		
		System.out.println(obj2.orderId);
		System.out.println(obj2.productId);
		System.out.println(obj2.orderQuantity);
		System.out.println(obj2.eachProductPrice);
		System.out.println(obj2.tax);
		System.out.println(obj2.deliveryPostalCode);
		System.out.println(obj2.orderTimeStamp);
		
		

	}

}
