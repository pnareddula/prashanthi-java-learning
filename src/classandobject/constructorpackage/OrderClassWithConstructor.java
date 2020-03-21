package classandobject.constructorpackage;

public class OrderClassWithConstructor {
	

	// State/Member Variables/ Instance Variables

	int orderId;
	int productId;
	int orderQuantity;
	double eachProductPrice;
	double tax;
	String deliveryPostalCode;
	String orderTimeStamp;

	// Constructor is a method whose name is same as class name

	// Constructor is used to initialize all the member variables in the class

	OrderClassWithConstructor() {
      orderId = 23;
      productId = 1;
      orderQuantity = 5;
      eachProductPrice = 12.5;
      tax = 0.25;
      deliveryPostalCode = "MK8 1BP";
      orderTimeStamp = "2020-01-01 23:34:21";
      
    
	}
	
	//Behaviour/ Member Methods/Instance Methods
	
	public void makeAnOrderMethod() {
		System.out.println("I have ordered lunch box");
		
	}
     public void cancelAnOrderMethod() {
	 System.out.println("I am cancelling Lunch box");
 }
 
     public void returnAnOrderMethod() {
    	 System.out.println("I am returning this order because its defective");
     }
     
     public void calculateOrderTotalPriceMethod() {
    	 System.out.println((orderQuantity*eachProductPrice)+tax);
     }
}
