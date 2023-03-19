package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_IfValid_ShouldReturnTrue() {
        UserRegistration registration = new UserRegistration();
        try {
            boolean result = registration.checkName("Kartikeya");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenFirstName_IfInvalid_ShouldReturnFalse() {
        UserRegistration registration = new UserRegistration();
        try {
            boolean result = registration.checkName("kartikeya");
            Assert.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenLastName_IfValid_ShouldReturnTrue() {
        UserRegistration registration = new UserRegistration();
        try {
            boolean result = registration.checkName("Maan");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test(expected = Exception.class)
    public void givenLastName_IfInvalid_ShouldReturnFalse() {
        UserRegistration registration = new UserRegistration();
        try {
            boolean result = registration.checkName(null);
            Assert.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenName_IfNull_ShouldThrowUserRegistrationException() {
        UserRegistration registration = new UserRegistration();
        try {
            registration.checkName(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.UserExceptionType.NULL, e.type);
        }
    }

    @Test
    public void givenEmail_IfValid_ShouldReturnTrue() {
        UserRegistration registration = new UserRegistration();
        try {
            boolean result = registration.checkEmail("kartikeya.maan1997@gmail.com");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenMobileNumber_IfValid_ShouldReturnTrue() {
        UserRegistration registration = new UserRegistration();
        try {
            boolean result = registration.checkMobileNumber("91 9411549343");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenMobileNumber_IfInvalid_ShouldReturnFalse() {
        UserRegistration registration = new UserRegistration();
        try {
            boolean result = registration.checkMobileNumber("919411549343");
            Assert.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenMobileNumber_IfNull_ThrowsUserRegistrationException() {
        UserRegistration registration = new UserRegistration();
        try {
            registration.checkMobileNumber(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.UserExceptionType.NULL, e.type);
        }
    }

    @Test
    public void givenPassword_IfValid_ShouldReturnTrue() {
        UserRegistration registration = new UserRegistration();
        try {
            boolean result = registration.checkPassword("a-K4s9dgVo");
            Assert.assertTrue(result);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenPassword_IfInvalid_ShouldReturnFalse() {
        UserRegistration registration = new UserRegistration();
        try {
            boolean result = registration.checkPassword("a*bsKdg&Vo");
            Assert.assertFalse(result);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }
}
