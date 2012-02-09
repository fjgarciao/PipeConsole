package com.fjgarciao.pipeconsole.persistence;

import java.io.Serializable;

public abstract class Entidad<Q> implements Serializable {

	private static final long serialVersionUID = 1L;

	public abstract Q getId();
	
	public abstract void setId(Q primeryKey);
	
	public boolean isNew() {
		return getId() == null;
	}
	
	public abstract boolean equals(Object obj);
	
	public abstract int hashCode();
}
