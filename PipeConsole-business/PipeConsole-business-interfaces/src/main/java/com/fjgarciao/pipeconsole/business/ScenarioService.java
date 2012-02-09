package com.fjgarciao.pipeconsole.business;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.fjgarciao.pipeconsole.persistence.model.Scenario;

@Transactional(readOnly = true)
public interface ScenarioService {

	@Transactional
	Scenario createNewScenario();
	
	List<Scenario> getAll();
	
	Scenario loadScenario(long scenarioId);
	
	@Transactional
	Scenario saveScenario(Scenario scenario);
	
	@Transactional
	int deleteScenario(Scenario scenario);
}
