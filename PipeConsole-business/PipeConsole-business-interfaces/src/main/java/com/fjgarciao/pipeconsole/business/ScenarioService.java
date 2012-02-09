package com.fjgarciao.pipeconsole.business;

import org.springframework.transaction.annotation.Transactional;

import com.fjgarciao.pipeconsole.persistence.model.Scenario;

@Transactional(readOnly = true)
public interface ScenarioService {

	@Transactional
	Scenario createNewScenario();
	
	
}
