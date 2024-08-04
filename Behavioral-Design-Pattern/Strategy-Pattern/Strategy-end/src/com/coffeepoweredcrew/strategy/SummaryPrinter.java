package com.coffeepoweredcrew.strategy;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

//Concrete strategy
public class SummaryPrinter implements OrderPrinter{

	@Override
	public void print(Collection<Order> orders) {
		System.out.println("*************** Order Summery ****************");
		
		Iterator<Order> iterator = orders.iterator();
		
		int total = 0;
		for(int i=0; iterator.hasNext(); i++) {
			Order order = iterator.next();
			System.out.println(i + " " + order.getId() + "  " + order.getDate() + 
								"  " + order.getTotal());
			total += order.getTotal();
		}
		
		System.out.println("********************************************");
		System.out.println("Total " + total);
		
	}

	
}
