package com.fjgarciao.pipeconsole.business;

public class TempValveImpl extends ValveImpl implements TempValve {

	int temperature = 0;
	
	@Override
	public int getTemperature() {
		return temperature;
	}

	@Override
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

}
