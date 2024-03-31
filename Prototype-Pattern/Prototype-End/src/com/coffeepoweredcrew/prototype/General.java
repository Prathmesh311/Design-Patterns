package com.coffeepoweredcrew.prototype;

//Doesn't support cloning
public class General extends GameUnit{

	private String state = "idle";
	
	public void boostMorale() {
		this.state = "MoralBoost";
	}
	
	@Override
	public String toString() {
		return "General "+state+" @ "+getPosition();
	}
	
	@Override
	protected GameUnit clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("General is unique");
	}

	@Override
	protected void reset() {
		throw new UnsupportedOperationException("Reset not supported");	
	}
}
