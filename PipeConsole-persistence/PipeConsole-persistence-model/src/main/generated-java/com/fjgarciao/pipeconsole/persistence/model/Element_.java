package com.fjgarciao.pipeconsole.persistence.model;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Element.class)
public abstract class Element_ {

	public static volatile SingularAttribute<Element, Long> id;
	public static volatile SingularAttribute<Element, Integer> distance;
	public static volatile SingularAttribute<Element, Scenario> scenario;
	public static volatile SingularAttribute<Element, ElementType> type;

}

