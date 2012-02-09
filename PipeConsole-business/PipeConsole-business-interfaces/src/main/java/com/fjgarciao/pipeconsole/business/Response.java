package com.fjgarciao.pipeconsole.business;

import java.io.Serializable;

public class Response implements Serializable {

	private static final long serialVersionUID = 1L;

	public enum Result {
		OK, NOT_AVAILABLE, ERROR
	}

	private Result result;

	private int flowOffered;

	public Response() {
	}

	public Response(Result result) {
		this.result = result;
	}

	public Response(Result result, int flowOffered) {
		this.result = result;
		this.flowOffered = flowOffered;
	}

	public Result getResult() {
		return result;
	}

	public int getFlowOffered() {
		return flowOffered;
	}

	@Override
	public String toString() {
		return "Response [result=" + result + ", flowOffered=" + flowOffered
				+ "]";
	}

}
