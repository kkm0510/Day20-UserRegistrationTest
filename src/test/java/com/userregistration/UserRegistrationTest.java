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
    public void givenFirstName_IfInvalid_ShouldReturnFalse(){
        UserRegistration registration = new UserRegistration();
        boolean result=registration.checkFirstName("kartikeya");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_IfValid_ShouldReturnTrue(){
        UserRegistration registration = new UserRegistration();
        boolean result=registration.checkLastName("Maan");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_IfInvalid_ShouldReturnFalse(){
        UserRegistration registration = new UserRegistration();
        boolean result=registration.checkLastName("mA@n");
        Assert.assertFalse(result);
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

    @Test
    public void givenMobileNumber_IfInvalid_ShouldReturnFalse(){
        UserRegistration registration = new UserRegistration();
        boolean result=registration.checkMobileNumber("919411368453");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_IfValid_ShouldReturnTrue(){
        UserRegistration registration = new UserRegistration();
        boolean result=registration.checkPassword("a*Kbs9dg&Vo");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_IfInvalid_ShouldReturnFalse(){
        UserRegistration registration = new UserRegistration();
        boolean result=registration.checkPassword("a*bsKdg&Vo");
        Assert.assertFalse(result);
    }
}
