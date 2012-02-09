package com.fjgarciao.pipeconsole.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fjgarciao.pipeconsole.persistence.Entidad;

/**
 * Entity implementation class for Entity: Element
 * 
 */
@Entity
public class Element extends Entidad<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private ElementType type;

	@Column(nullable = false)
	private Integer priority; // 1 is max
	
	@Column(nullable = false)
	private Integer distance; // En cms
	
	@Column(nullable = false)
	private Integer maxFlow; // En cls
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Canal canal;

	@ManyToOne
	private Scenario scenario;
	
	public Element() {
		super();
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ElementType getType() {
		return type;
	}

	public void setType(ElementType type) {
		this.type = type;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public Integer getMaxFlow() {
		return maxFlow;
	}

	public void setMaxFlow(Integer maxFlow) {
		this.maxFlow = maxFlow;
	}

	public Canal getCanal() {
		return canal;
	}

	public void setCanal(Canal canal) {
		this.canal = canal;
	}

	public Scenario getScenario() {
		return scenario;
	}

	public void setScenario(Scenario scenario) {
		this.scenario = scenario;
	}

	@Override
	public String toString() {
		return "Element [id=" + id + ", type=" + type + ", priority="
				+ priority + ", distance=" + distance + ", maxFlow=" + maxFlow
				+ ", canal=" + canal + ", scenario=" + scenario.getId() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Element other = (Element) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
