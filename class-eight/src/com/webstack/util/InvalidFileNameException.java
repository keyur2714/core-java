package com.webstack.util;

public class InvalidFileNameException extends Exception {

	private String errorCode;
	private String errorMessage;

	public InvalidFileNameException(String errorMessage) {
		this.errorMessage = errorMessage;
		this.errorCode = "222";
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	@Override
	public String toString() {
		return "InvalidFileNameException [errorCode=" + errorCode + ", errorMessage=" + errorMessage + "]";
	}

}
