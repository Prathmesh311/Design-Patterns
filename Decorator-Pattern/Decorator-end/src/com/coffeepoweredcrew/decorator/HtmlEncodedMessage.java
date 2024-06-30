package com.coffeepoweredcrew.decorator;

import org.apache.commons.lang3.StringEscapeUtils;

//Decorator. Implements component interface
public class HtmlEncodedMessage implements Message{
	
	private Message msg;
	
	public HtmlEncodedMessage(Message msg) {
		this.msg = msg;
	}

	@SuppressWarnings("deprecation")
	@Override
	public String getContent() {
		return StringEscapeUtils.escapeHtml4(msg.getContent());
	}

}
