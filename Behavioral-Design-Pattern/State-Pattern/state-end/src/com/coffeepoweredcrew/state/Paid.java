package com.coffeepoweredcrew.state;

public class Paid implements OrderState{

	@Override
	public double handleCancellation() {
		System.out.println("Notify pyment gateway to provide refund.");
		System.out.println("cacellation Processed.");
		return 10;
	}
	
}
