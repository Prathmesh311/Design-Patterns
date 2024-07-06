package com.coffeepoweredcrew.flyweight;

//A concrete Flyweight. Instance is shared
public class SystemErrorMessage implements ErrorMessage{
	
	private String messageTemplete;
	
	private String urlBase;
	

	
	public SystemErrorMessage(String messageTemplete, String urlBase) {
		this.messageTemplete = messageTemplete;
		this.urlBase = urlBase;
	}


	@Override
	public String getText(String code) {
		return messageTemplete.replace("$errorCode", code) + urlBase + code;
	}


}
