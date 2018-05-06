package com.andrebronca.socialbooks.services.exceptions;

public class AutorExistenteException extends RuntimeException {
	
	private static final long serialVersionUID = -2863336570610226194L;

	public AutorExistenteException(String msg) {
		super(msg);
	}
	
	public AutorExistenteException(String msg, Throwable causa) {
		super(msg, causa);
	}
}
