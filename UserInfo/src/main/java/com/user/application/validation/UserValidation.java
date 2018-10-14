package com.user.application.validation;

public class UserValidation {

	public boolean isEmptyOrNull(String str) {
		if (str == null || str.trim().isEmpty()) {
			return true;
		}
		return false;
	}

}
