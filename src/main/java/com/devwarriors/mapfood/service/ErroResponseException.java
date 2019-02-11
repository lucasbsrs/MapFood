package com.devwarriors.mapfood.service;

public abstract class ErroResponseException extends Exception {

	private static final long serialVersionUID = 1L;

	public abstract String getMensagem();
}
