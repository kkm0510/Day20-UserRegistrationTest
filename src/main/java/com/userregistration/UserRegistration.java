package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static final String NAME="^[A-Z][a-z]{3,}$";

    public boolean checkFirstName(String name) {
        Pattern pattern=Pattern.compile(NAME);
        Matcher matcher= pattern.matcher(name);
        return matcher.matches();
    }

    public boolean checkLastName(String name) {
        Pattern pattern=Pattern.compile(NAME);
        Matcher matcher= pattern.matcher(name);
        return matcher.matches();
    }
}
