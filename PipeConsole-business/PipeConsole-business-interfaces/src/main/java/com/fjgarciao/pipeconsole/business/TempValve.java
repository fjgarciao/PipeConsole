package com.fjgarciao.pipeconsole.business;

public interface TempValve extends Valve {

	int getTemperature();
	
	void setTemperature(int temperature);
}
