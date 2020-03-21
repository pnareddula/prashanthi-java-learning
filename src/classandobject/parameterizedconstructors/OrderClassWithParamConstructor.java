package classandobject.parameterizedconstructors;

public class OrderClassWithParamConstructor {

	// state/member variables/instance variables#

	int orderId;
	int productId;
	int orderQuantity;
	double eachProductPrice;
	double tax;
	String deliveryPostalCode;
	String orderTimeStamp;

	// Here we are not going to initialise values, rather we pass initial values
	// from a calling program
	
	OrderClassWithParamConstructor(int orderIdFromCaller, int productIdFromCaller, int orderQuantityFromCaller, double eachProductPriceFromCaller, double taxFromCaller, String deliveryPostalCodeFromCaller, String orderTimeStampFromCaller) {

	orderId = orderIdFromCaller;
	productId = productIdFromCaller;
	orderQuantity = orderQuantityFromCaller;
	eachProductPrice = eachProductPriceFromCaller;
	tax = taxFromCaller;
	deliveryPostalCode = deliveryPostalCodeFromCaller;
	orderTimeStamp = orderTimeStampFromCaller;
	}
//Behaviour/member methods/ instance methods

	public void makeAnOrderMethod() {

     System.out.println("I have ordered Lunch Box");
    }

	public void cancelAnOrderMethod() {
		System.out.println("Iam cancelling Lunch Box");
	}
	
	public void returnAnOrderMethod() {
		System.out.println("I am returning this because I changed my mind");
	}
	
	public void calculateTotalOrderpriceMethod() {
		System.out.println((orderQuantity*eachProductPrice)+tax);
	}
}
	