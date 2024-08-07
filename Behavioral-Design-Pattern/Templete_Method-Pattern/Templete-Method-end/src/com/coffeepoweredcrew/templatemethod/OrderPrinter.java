package com.coffeepoweredcrew.templatemethod;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

//Abstract base class defines the template method
public abstract class OrderPrinter {
	
	public void printOrder(Order order, String fileName) throws FileNotFoundException {
		try(PrintWriter writer = new PrintWriter(fileName)){
			writer.append(start());
			writer.append(formatOrderNumber(order));
			writer.append(formatTotal(order));
			writer.append(formatItems(order));
			writer.append(end());
			
		}
	}

	protected abstract String start();
	protected abstract String formatOrderNumber(Order order);
	protected abstract String formatTotal(Order order);
	protected abstract String formatItems(Order order);
	protected abstract String end();
}
