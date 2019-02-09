package com.devwarrios.mapfood.service;

public abstract class EntidadeInexistenteException extends Exception {

	private static final long serialVersionUID = 1L;

	public abstract String getMensagem();
}
