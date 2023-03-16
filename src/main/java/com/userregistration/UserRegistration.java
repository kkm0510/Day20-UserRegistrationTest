package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static final String NAME="^[A-Z][a-z]{2,}$";

    public boolean checkFirstName(String name) {
        Pattern pattern=Pattern.compile(NAME);
        Matcher matcher= pattern.matcher(name);
        return matcher.matches();
    }
}
