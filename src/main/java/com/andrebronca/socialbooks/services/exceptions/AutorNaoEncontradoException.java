package com.andrebronca.socialbooks.services.exceptions;

public class AutorNaoEncontradoException extends RuntimeException {
	
	private static final long serialVersionUID = -2863336570610226194L;

	public AutorNaoEncontradoException(String msg) {
		super(msg);
	}
	
	public AutorNaoEncontradoException(String msg, Throwable causa) {
		super(msg, causa);
	}
}
