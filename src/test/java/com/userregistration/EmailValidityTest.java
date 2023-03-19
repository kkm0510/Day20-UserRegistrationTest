package com.userregistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailValidityTest {

    private final String email;
    private final boolean expectedResult;
    private UserRegistration registration;

    public EmailValidityTest(String email, boolean expectedResult) {
        this.expectedResult = expectedResult;
        this.email = email;
    }

    @Before
    public void initialize() {
        registration = new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection<Object> input() {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false},
                {"abc123@.com", false},
                {"abc123@.com.com", false},
                {".abc@abc.com", false},
                {"abc()*@gmail.com", false},
                {"abc@%*.com", false},
                {"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false},
                {"abc@abc@gmail.com", false},
                {"abc@gmail.com.1a", false},
                {"abc@gmail.com.aa.au", false}
        });
    }

    @Test
    public void givenMultipleEmailAddress_IfValid_ShouldReturnTrueElseFalse() {
        try {
            Assert.assertEquals(expectedResult, registration.checkEmail(email));
        }
        catch(UserRegistrationException e){
            System.out.println(e.getMessage());
        }
    }
}

