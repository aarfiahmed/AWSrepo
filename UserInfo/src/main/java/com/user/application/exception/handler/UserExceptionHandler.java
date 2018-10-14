package com.user.application.exception.handler;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.user.application.exception.InvalidUserException;
import com.user.application.exception.msg.ErrorMsg;
@Component
@ControllerAdvice(annotations=RestController.class)
public class UserExceptionHandler {

	
	@ExceptionHandler(InvalidUserException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public HttpEntity<ErrorMsg> handleInvalideUserException(
			InvalidUserException ex) {
		System.out.println("in controller advice");
		HttpEntity<ErrorMsg> error = new HttpEntity<ErrorMsg>(new ErrorMsg(
				"404", ex.getMessage()));
		return error;
	}	
}
