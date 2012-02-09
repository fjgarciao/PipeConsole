package com.fjgarciao.pipeconsole.business;

public interface Valve {

	public enum ValveState {
		OPEN, CLOSED
	}
	
	void open();
	
	void close();
	
	boolean isOpen();
	
	boolean isClosed();
	
	ValveState getState();
}
