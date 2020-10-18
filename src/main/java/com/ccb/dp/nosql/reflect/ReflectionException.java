package com.ccb.dp.nosql.reflect;

public class ReflectionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUid = 1L;
	
	public ReflectionException() {
	}
	
	public ReflectionException(String msg) {
		super(msg);
	}
	
	public ReflectionException(Throwable cause) {
		super(cause);
	}
	
	public ReflectionException(String msg, Throwable cause) {
		super(msg,cause);
	}
}
