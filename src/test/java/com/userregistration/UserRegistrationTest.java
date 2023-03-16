package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_IfFirstLetterIsUppercase_ShouldReturnTrue(){
        UserRegistration registration = new UserRegistration();
        boolean result=registration.checkFirstName("Kartikeya");
        Assert.assertTrue(result);
    }

}
