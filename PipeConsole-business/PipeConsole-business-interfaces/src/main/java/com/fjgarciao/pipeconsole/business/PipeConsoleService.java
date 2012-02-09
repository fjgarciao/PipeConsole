package com.fjgarciao.pipeconsole.business;

import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface PipeConsoleService {

	Response checkAvailability(long elementId, int temperature, int flow);
	
	Response tapOn(long elementId, int temperature, int flow);
	
	Response tapOff(long elementId);
}
