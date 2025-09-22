package Inheritence;

class Order{
	String orderId;
	String orderDate;
	Order(String orderId, String orderDate){
		this.orderDate = orderDate;
		this.orderId = orderId;
	}
	String orderStats() {
		return "Order Placed on "+orderDate;
	}
	void displayDetails() {
		System.out.println("Order Id: "+orderId);
		System.out.println("Order Date: "+orderDate);
	}
}
class ShippingOrder extends Order{
	String trackingNumber;
	ShippingOrder(String orderId, String OrderDate, String trackingNumber){
		super(orderId,OrderDate);
		this.trackingNumber = trackingNumber;
	}
	@Override
	String orderStats() {
		return "Order Shipped With Tracking Details "+ trackingNumber;
	}
	@Override
	void displayDetails() {
		super.displayDetails();
		System.out.println("Order has been successfully shipped with tracking id : "+trackingNumber);
		
	}
	
}

class DeliveredOrder extends ShippingOrder{
	String deliveryDate ;
	DeliveredOrder(String orderId, String orderDate, String trackingNumber ,String deliveryDate){
		super(orderId, orderDate,trackingNumber);
		this.deliveryDate = deliveryDate;
	}
	@Override
	String orderStats() {
		return "Order Deliverd on "+ deliveryDate;
	}
	@Override
	void displayDetails() {
		super.displayDetails();
		System.out.println("Order DileveredOn "+ deliveryDate);
	}
}
public class OnlineRetailOrderManagement {
	public static void main(String[] args) {
		Order o1 = new Order("O101", "2025-09-20");
        ShippingOrder o2 = new ShippingOrder("O102", "2025-09-21", "TRK12345");
        DeliveredOrder o3 = new DeliveredOrder("O103", "2025-09-19", "TRK67890", "2025-09-22");
        Order[] orders = {o1, o2, o3};
        
        for(Order o : orders) {
        	o.displayDetails();
        	System.out.println("Order Status : "+o.orderStats());
        }

	}
}
