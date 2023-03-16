package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static final String NAME = "^[A-Z][a-z]{3,}$";
    public static final String EMAIL = "^[a-zA-Z0-9]+[._+-]?[a-zA-Z0-9]+@[a-zA-Z0-9]+[.]+[a-z]{2,4}[.]?[a-z]{0,3}$";
    public static final String MOBILE_NUMBER = "^[0-9]{2}[ ][0-9]{10}$";
    public static final String PASSWORD = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[#$@&*_-])[a-zA-Z0-9#$@&*_-]{8,}$";

    public boolean checkFirstName(String name) {
        Pattern pattern = Pattern.compile(NAME);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public boolean checkLastName(String name) {
        Pattern pattern = Pattern.compile(NAME);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public boolean checkEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean checkMobileNumber(String mobileNumber) {
        Pattern pattern = Pattern.compile(MOBILE_NUMBER);
        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }

    public boolean checkPassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
