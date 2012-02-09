package com.fjgarciao.pipeconsole.business;

public class ValveImpl implements Valve {

	private ValveState state = ValveState.CLOSED;
	
	@Override
	public void open() {
		if (state == ValveState.CLOSED) {
			state = ValveState.OPEN;
		}
	}

	@Override
	public void close() {
		if (state == ValveState.OPEN) {
			state = ValveState.CLOSED;
		}
	}

	@Override
	public boolean isOpen() {
		return state == ValveState.OPEN;
	}

	@Override
	public boolean isClosed() {
		return state == ValveState.CLOSED;
	}

	@Override
	public ValveState getState() {
		return state;
	}

}
