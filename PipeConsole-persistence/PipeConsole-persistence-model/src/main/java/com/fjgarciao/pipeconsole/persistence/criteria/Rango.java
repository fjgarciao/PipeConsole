package com.fjgarciao.pipeconsole.persistence.criteria;

import java.io.Serializable;

public class Rango<T extends Comparable<T>> implements Serializable {

	private static final long serialVersionUID = 1L;

	private T inferior;
	private T superior;

	public Rango() {
	};

	public Rango(T inferior, T superior) {
		this.inferior = inferior;
		this.superior = superior;
	}

	public T getInferior() {
		return inferior;
	}

	public void setInferior(T inferior) {
		this.inferior = inferior;
	}

	public T getSuperior() {
		return superior;
	}

	public void setSuperior(T superior) {
		this.superior = superior;
	}

	public boolean isEmpty() {
		return this.inferior == null && this.superior == null;
	}

//	private boolean checkRango() throws PersistenceException {
//		if (this.inferior != null && this.superior != null
//				&& inferior.compareTo(superior) >= 0)
//			throw new PersistenceException(Errores.RANGO_INVALIDO,
//					"Error en los valores del rango");
//		return true;
//	}
}
