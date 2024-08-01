package com.coffeepoweredcrew.observer;

public class Client {

    public static void main(String[] args) {
    	Order order = new Order("100");
    	OrderObserver priceObserver = new PriceObserver();
    	OrderObserver quantityObserver = new QuantityObserver();
    	
    	order.attach(priceObserver);
    	order.attach(quantityObserver);;
    	
    	order.addItem(60);
    	order.addItem(180);
    	order.addItem(180);
    	order.addItem(180);
    	order.addItem(180);
    	order.addItem(180);
    	
    	System.out.println(order);
    }
}
