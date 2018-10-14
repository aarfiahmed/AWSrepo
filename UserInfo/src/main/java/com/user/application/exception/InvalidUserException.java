package com.user.application.exception;

public class InvalidUserException extends RuntimeException {
	String msg;

	public InvalidUserException(String msg) {
		super(msg);
		this.msg = msg;
	}

	@Override
	public String toString() {
		return msg;
	}

}
