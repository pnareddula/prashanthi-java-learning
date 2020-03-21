package classandobject.firstclassandobject;

public class Order {
	
	//static /member variables /instance variables
	
	int productId = 1;
	int orderQuantity = 3;
	double eachProductPrice = 10.34;
	double tax = 0.25;
	String deliveryPostalCode = "Mk8 1BP";
	
	//behaviour /member methods /instance methods
	
	public void makeAnOrderMethod() {
		System.out.println("I have ordered lunch box");
	}
	
	
	public void cancelAnOrderMethod() {
		System.out.println("I am cancelling Lunch box");
	}
	
	
	public void returnAnObjectMethod() {
		System.out.println("I am returning this order becasue its defective");
	}
	
	
	public void calculateTotalOrderPriceMethod() {
	System.out.println((orderQuantity*eachProductPrice)+tax);
	}
	
}
