package classandobject.parameterizedconstructors;

public class OrderClassWithParamConstructorCaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OrderClassWithParamConstructor obj1 = new OrderClassWithParamConstructor(1, 12, 10, 3.5, 0.25, "MK44TL", "2020-01-01 12:00:00");
		
		System.out.println(obj1.orderId);
		System.out.println(obj1.productId);
		System.out.println(obj1.orderQuantity);
		System.out.println(obj1.tax);
		System.out.println(obj1.deliveryPostalCode);
		System.out.println(obj1.orderTimeStamp);
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		OrderClassWithParamConstructor obj2 = new OrderClassWithParamConstructor(2, 122, 5, 13.5, 1.25, "MK8 1BP", "2020-03-18 19:52:10");
		System.out.println(obj1.orderId);
		System.out.println(obj1.productId);
		System.out.println(obj1.orderQuantity);
		System.out.println(obj1.tax);
		System.out.println(obj1.deliveryPostalCode);
		System.out.println(obj1.orderTimeStamp);
		
	}
}
