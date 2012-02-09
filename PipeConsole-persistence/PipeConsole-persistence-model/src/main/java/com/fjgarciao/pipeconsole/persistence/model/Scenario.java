package com.fjgarciao.pipeconsole.persistence.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fjgarciao.pipeconsole.persistence.Entidad;

/**
 * Entity implementation class for Entity: Scenario
 * 
 */
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"name"}))
public class Scenario extends Entidad<Long> {

	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	
	@Column(nullable = false)
	private String name;

	@OneToMany(orphanRemoval = true, mappedBy = "scenario")
	private List<Element> elements;
	
	public Scenario() {
		super();
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Element> getElements() {
		return elements;
	}

	public void setElements(List<Element> elements) {
		this.elements = elements;
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
		Scenario other = (Scenario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
