package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_IfValid_ShouldReturnTrue(){
        UserRegistration registration = new UserRegistration();
        boolean result=registration.checkFirstName("Kartikeya");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_IfValid_ShouldReturnTrue(){
        UserRegistration registration = new UserRegistration();
        boolean result=registration.checkLastName("Maan");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_IfValid_ShouldReturnTrue(){
        UserRegistration registration = new UserRegistration();
        boolean result=registration.checkEmail("kartikeya.maan1997@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_IfValid_ShouldReturnTrue(){
        UserRegistration registration = new UserRegistration();
        boolean result=registration.checkMobileNumber("91 9411368453");
        Assert.assertTrue(result);
    }
}
