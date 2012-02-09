package com.fjgarciao.pipeconsole.persistence;

import com.fjgarciao.pipeconsole.AppException;

public class PersistenceException extends AppException {

	private static final long serialVersionUID = 1L;

	public PersistenceException() {
	}

	public PersistenceException(String message) {
		super(message);
	}

	public PersistenceException(Throwable cause) {
		super(cause);
	}

	public PersistenceException(String message, Throwable cause) {
		super(message, cause);
	}
}
