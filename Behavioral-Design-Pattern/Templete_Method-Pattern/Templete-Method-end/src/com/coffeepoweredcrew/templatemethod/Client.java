package com.coffeepoweredcrew.templatemethod;

import java.io.FileNotFoundException;

public class Client {

	public static void main(String[] args) throws FileNotFoundException {
		Order order = new Order("1001");
		
		order.addItem("Milk", 4.35);
		order.addItem("Bread", 8.99);
		order.addItem("Eggs", 22.5);
		
		OrderPrinter printer = new TextPrinter();
		OrderPrinter htmlPrinter = new HtmlPrinter();
		
		printer.printOrder(order, "1001.txt");
		htmlPrinter.printOrder(order, "1001.html");
	}
}
