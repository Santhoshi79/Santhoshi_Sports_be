package com.falconSports.exception;

public class IdNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private String message;

	public IdNotFoundException(String message) {
		super();
		this.message = message;
	}
	
	public IdNotFoundException()
	{
		
	}

}
