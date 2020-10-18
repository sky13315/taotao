package com.ccb.dp.nosql.client;

public class NsqlMapException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUid = 1L;
	
	public NsqlMapException() {
	}
	
	public NsqlMapException(String msg) {
		super(msg);
	}
	
	public NsqlMapException(Throwable cause) {
		super(cause);
	}
	
	public NsqlMapException(String msg, Throwable cause) {
		super(msg,cause);
	}
}
