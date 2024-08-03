package com.coffeepoweredcrew.state;

//Context class
public class Order {
	
	private OrderState currState;
	
	
	public Order() {
		currState = new New();
	}

	
	public double cancel() {
		double charge = currState.handleCancellation();
		currState = new Cancelled();
		return charge;
	}
   
	public void paymentSuccessful() {
		currState = new Paid();
		
	}
	
	public void dispatched() {
		currState = new InTransit();
		
	}
	
	public void delivered() {
		currState = new Delivered();
	}
}
