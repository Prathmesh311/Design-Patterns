package com.coffeepoweredcrew.strategy;

import java.util.Collection;
import java.util.LinkedList;

//Strategy
public interface OrderPrinter {
	void print(Collection<Order> orders);
}
