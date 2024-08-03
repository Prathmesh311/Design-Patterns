package com.coffeepoweredcrew.state;

public class New implements OrderState{

	@Override
	public double handleCancellation() {
		System.out.println("No processing needed. Direct Cancelled!");
		return 0;
	}

	
}
