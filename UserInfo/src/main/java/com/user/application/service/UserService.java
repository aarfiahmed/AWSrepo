package com.user.application.service;

import org.springframework.stereotype.Service;

import com.user.application.exception.InvalidUserException;
import com.user.application.modal.UserModal;
import com.user.application.validation.UserValidation;
@Service
public class UserService {

	
	public UserModal getUserInfo(String userName) throws InvalidUserException {
		// validating
		if (new UserValidation().isEmptyOrNull(userName)) {
			throw new InvalidUserException("UserName is blank or empty");
		}

		return null;
	}
}
