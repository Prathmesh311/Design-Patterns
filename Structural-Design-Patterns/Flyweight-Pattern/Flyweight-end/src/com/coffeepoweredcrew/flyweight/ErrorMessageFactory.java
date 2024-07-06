package com.coffeepoweredcrew.flyweight;

import java.util.HashMap;

//Flyweight factory. Returns shared flyweight based on key
public class ErrorMessageFactory {
	
	//This serves as key for getting flyweight instance
	public enum ErrorType {GenericSystemError, PageNotFoundError, ServerError}
	
	private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();

	public static ErrorMessageFactory getInstance() {
		return FACTORY;
	}
	
	HashMap<ErrorType, SystemErrorMessage> errorMessage = new HashMap<>();
	
	private ErrorMessageFactory() {
		errorMessage.put(ErrorType.GenericSystemError, 
				new SystemErrorMessage("A genetic error of type $errorCode has occured! please refer:- ", "https://www.google.com/"));
		errorMessage.put(ErrorType.PageNotFoundError, 
				new SystemErrorMessage("A genetic error of type $errorCode has occured! please refer:- ", "https://www.google.com/"));
		
	}
	
	public SystemErrorMessage getError(ErrorType type) {
		return errorMessage.get(type);
	}
	
	
	public UserBannedErrorMessage getUserBannedMessage(String caseId) {
		return new UserBannedErrorMessage(caseId);
	}
}
