package com.userregistration;

public class UserRegistrationException extends RuntimeException {

    enum UserExceptionType {
        NULL;
    }

    UserExceptionType type;

    public UserRegistrationException(UserExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
