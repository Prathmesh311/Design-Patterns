package com.coffeepoweredcrew.proxy;


public class Client {

	public static void main(String[] args) {
		Image image = ImageFactory.getImage("demo.png");
		image.setLocation(new Point2D(10, 12));
		
		System.out.println("Create new object.........");
		
		image.render();
	}

}
