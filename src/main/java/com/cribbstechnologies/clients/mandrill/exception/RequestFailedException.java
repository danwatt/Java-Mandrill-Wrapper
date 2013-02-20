package com.cribbstechnologies.clients.mandrill.exception;

import java.io.IOException;

public class RequestFailedException extends IOException {

	private static final long serialVersionUID = 1L;

	public RequestFailedException(String message, Throwable t) {
		super(message, t);
	}
	
	public RequestFailedException(String message) {
		super(message);
	}
}
