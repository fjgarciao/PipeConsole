package com.fjgarciao.pipeconsole.persistence.model;

import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Scenario.class)
public abstract class Scenario_ {

	public static volatile SingularAttribute<Scenario, Long> id;
	public static volatile ListAttribute<Scenario, Element> elements;

}

