package classandobject.membermethods;

public class MemberMethods {
	
	//state/member variables/instance variables

	int orderId;
	int productId;
	int orderQuantity;
	double eachProductPrice;
	double tax;
	String deliveryPostalCode;
	String orderTimeStamp;
	
	//hard coded constructor
	MemberMethods(){
		orderId = 23;
		productId = 1;
		orderQuantity = 5;
		eachProductPrice = 12.5;
		tax = 0.25;
		deliveryPostalCode ="MK8 1BP";
		orderTimeStamp = "2020-03-18 20:48:12";
	}
	
	//Behaviour/member methods/instance methods
	
	//this method doesn't return any value
	
	public void makeAnOrderMethod() {
		System.out.println("I have ordered lunch box");
	}
		
		// This method return a double value and taking no parameters 
	
	public double returnTotalOrderPriceMethod() {
		return (orderQuantity*eachProductPrice)+tax;
		
		}
	
	//This method return string value and taking no parameters
	
	public String returnFullAddress() {
		return "44 Barrosa Way, Whitehouse, MK";
			
	}
	
	//This method returns a double value and taking single parameter 
	
	public double calculatedFinalPriceAfterDisc(double discountFromCaller) {
		double totalPriceBeforeDisc = (orderQuantity * eachProductPrice)+tax; 
		double totalPriceAfterDisc = totalPriceBeforeDisc - discountFromCaller;
		return totalPriceAfterDisc;	
	}
	
	//This method returns a double value and taking two parameters
	public double calcualtedFinalPriceAfterGenderDisc(double discountFromCaller, double genderDiscountFromCaller) {
	double totalPriceBeforeDisc = (orderQuantity * eachProductPrice)+tax;
	double totalPriceAfterDisc = totalPriceBeforeDisc - discountFromCaller - genderDiscountFromCaller;
	return totalPriceAfterDisc;
    }
	
}
