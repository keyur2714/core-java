package com.webstack.util;

public class InvalidEmailException extends RuntimeException {

	private String errorMessage;
	private String errorCode;
	
	public InvalidEmailException(String errorMessage) {
		this.errorMessage = errorMessage;
		this.errorCode = "101";
	}

	@Override
	public String toString() {
		return "InvalidEmailException [errorMessage=" + errorMessage + ", errorCode=" + errorCode + "]";
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}
	
	
	
	
	
}
