package com.coffeepoweredcrew.observer;

//Concrete observer
public class PriceObserver implements OrderObserver{

	@Override
	public void updated(Order order) {
		double total = order.getTotal();
		
		if(total >= 500) {
			order.setDiscount(25);
		}else if(total >= 200) {
			order.setDiscount(10);
		}
	}

}
