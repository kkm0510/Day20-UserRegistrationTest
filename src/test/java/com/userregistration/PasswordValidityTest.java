package com.userregistration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PasswordValidityTest {

    public String password;
    public boolean expectedResult;


    public PasswordValidityTest(String password, boolean expectedResult){
        this.expectedResult=expectedResult;
        this.password=password;
    }

    @Parameterized.Parameters
    public static Collection<Object> input(){
        return Arrays.asList(new Object[][] {
                {"aK9sadK9&v@", true},
                {"aK9s@", false},
                {"Kasdf43280sdfk", false},
                {"2384762K@&$", true},
        });
    }

    @Test
    public void givenMultiplePasswords_IfValid_ShouldReturnTrueElseReturnFalse(){
        Assert.assertEquals(expectedResult, new UserRegistration().checkPassword(password));
    }
}
