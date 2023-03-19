package com.userregistration;

public class UserRegistrationException extends Exception {

    enum UserExceptionType {
        NULL;
    }

    UserExceptionType type;

    public UserRegistrationException(UserExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
