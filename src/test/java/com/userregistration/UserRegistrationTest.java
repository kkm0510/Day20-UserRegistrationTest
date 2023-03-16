package com.userregistration;

import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_IfFirstLetterIsUppercase_ShouldReturnTrue(){
        UserRegistration registration = new UserRegistration();
        registration.checkFirstName("Kartikeya");
    }


}
