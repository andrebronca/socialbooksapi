package com.andrebronca.socialbooks.services.exceptions;

public class LivroNaoEncontradoException extends RuntimeException {
	
	private static final long serialVersionUID = -2863336570610226194L;

	public LivroNaoEncontradoException(String msg) {
		super(msg);
	}
	
	public LivroNaoEncontradoException(String msg, Throwable causa) {
		super(msg, causa);
	}
}
