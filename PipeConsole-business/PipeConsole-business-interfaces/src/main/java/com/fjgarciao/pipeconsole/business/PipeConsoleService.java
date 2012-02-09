package com.fjgarciao.pipeconsole.business;

import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface PipeConsoleService {

	Response tapOn(long elementId, int temperature);
	
	Response tapOff(long elementId);
}
