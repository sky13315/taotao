package com.ccb.dp.nosql.type;

public class TypeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TypeException() {}
	
	public TypeException(String msg) {
		super(msg);
	}
	
	public TypeException(Throwable cause) {
		super(cause);
	}
	
	public TypeException(String msg, Throwable cause) {
		super(msg,cause);
	}
}
