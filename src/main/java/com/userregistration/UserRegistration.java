package com.userregistration;

import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static final String NAME = "^[A-Z][a-z]{3,}$";
    public static final String EMAIL = "^[a-zA-Z0-9]+[._+-]?[a-zA-Z0-9]+@[a-zA-Z0-9]+[.]+[a-z]{2,4}[.]?[a-z]{0,3}$";
    public static final String MOBILE_NUMBER = "^[0-9]{2}[ ][0-9]{10}$";
    public static final String PASSWORD = "^(?=.{8,})(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]*[@*#_-][a-zA-Z0-9]*$";


    public boolean checkName(String name) {
        try {
            Predicate<String> check = input -> Pattern.compile(NAME).matcher(input).matches();
            return check.test(name);
        } catch (NullPointerException e) {
            throw new UserRegistrationException(UserRegistrationException.UserExceptionType.NULL, "entered invalid input");
        }
    }

    public boolean checkEmail(String email) {
        try {
            Predicate<String> check = input -> Pattern.compile(EMAIL).matcher(input).matches();
            return check.test(email);
        } catch (NullPointerException e) {
            throw new UserRegistrationException(UserRegistrationException.UserExceptionType.NULL, "entered invalid input");
        }
    }

    public boolean checkMobileNumber(String mobileNumber)  {
        try {
            Predicate<String> check = input -> Pattern.compile(MOBILE_NUMBER).matcher(input).matches();
            return check.test(mobileNumber);
        } catch (NullPointerException e) {
            throw new UserRegistrationException(UserRegistrationException.UserExceptionType.NULL, "entered invalid input");
        }
    }

    public boolean checkPassword(String password)  {
        try {
            Predicate<String> check = input -> Pattern.compile(PASSWORD).matcher(input).matches();
            return check.test(password);
        } catch (NullPointerException e) {
            throw new UserRegistrationException(UserRegistrationException.UserExceptionType.NULL, "entered invalid input");
        }
    }
}



























