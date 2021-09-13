package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidatorTest {

    // Password requirements testing
    @Test
    public void TestPasswordLengthIsBiggerThanX(){
        PasswordValidator passwordValidator = new PasswordValidator();
        assertEquals(8, passwordValidator.passwordLenght("password"));
    }

    @Test
    public void TestPasswordHasUppercase(){
        PasswordValidator passwordValidator = new PasswordValidator();
        assertTrue(passwordValidator.hasUppercase());
    }

    @Test
    public void TestPasswordHasSpecialSymbol(){
        PasswordValidator passwordValidator = new PasswordValidator();
        assertTrue(passwordValidator.hasSpecialSymbols());
    }

    @Test
    public void TestPhoneHasOnlyNumbers(){
        PhoneValidator phoneValidator = new PhoneValidator();
        assertTrue(phoneValidator.hasOnlyNumbers());
    }

    @Test
    public void TestPhoneChangeToLithuanianPrefix(){
        PhoneValidator phoneValidator = new PhoneValidator();
        assertTrue(phoneValidator.changeToLithuanianPrefix());
    }

    @Test
    public void TestPhoneAddNewPhoneCodesRules(){
        PhoneValidator phoneValidator = new PhoneValidator();
        assertTrue(phoneValidator.addNewPhoneRules());
    }

    // Email test requirements
    @Test
    public void TestEmailHasEtaSymbol(){
        EmailValidator emailValidator = new EmailValidator();
        assertTrue(emailValidator.hasEtaSymbol());
    }

    @Test
    public void TestEmailHasOnlyRightSymbols(){
        EmailValidator emailValidator = new EmailValidator();
        assertTrue(emailValidator.hasOnlyRightSymbols());
    }

    @Test
    public void TestEmailHasRightDomain(){
        EmailValidator emailValidator = new EmailValidator();
        assertTrue(emailValidator.hasRightDomain());
    }
}
