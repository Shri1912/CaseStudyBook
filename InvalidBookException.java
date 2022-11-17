package com.book.exception;

public class InvalidBookException extends Exception {
	
	public InvalidBookException() {
		super("Invalid book detail");
	}
	
	public InvalidBookException(String message) {
		super(message);
	}
}
