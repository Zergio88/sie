package com.educar.exception;

public class RegistroExistenteException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public RegistroExistenteException(String message) {
		super(message);
	}
}
