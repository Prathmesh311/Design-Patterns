package com.coffeepoweredcrew.proxy;


//Proxy class.
public class ImageProxy implements Image{
	
	private Image image;
	private String name;
	
	
	private Point2D location;
	
	public ImageProxy(String name) {
		this.name = name;
	}

	@Override
	public void setLocation(Point2D point2d) {
		if(image == null) {
			location = point2d;
			System.out.println("Location set in Proxy");
		}else {
			image.setLocation(point2d);
		}
		
	}

	@Override
	public Point2D getLocation() {
		if(image == null) {
			return location;
		}else {
			return image.getLocation();
		}
	}

	@Override
	public void render() {
		if(image == null) {
			image = new BitmapImage(name);
			if(image.getLocation() == null) {
				image.setLocation(location);
			}
		}else {
			image.render();
		}
	}
	
}
