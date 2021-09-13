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
        assertTrue(passwordValidator.hasUppercase("Password"));
    }

    @Test
    public void TestPasswordHasSpecialSymbol(){
        PasswordValidator passwordValidator = new PasswordValidator();
        assertTrue(passwordValidator.hasSpecialSymbols("P@ssword"));
    }

    @Test
    public void TestPhoneHasOnlyNumbers(){
        PhoneValidator phoneValidator = new PhoneValidator();
        assertTrue(phoneValidator.hasOnlyNumbers("861234567"));
    }

    @Test
    public void TestPhoneChangeToLithuanianPrefix(){
        PhoneValidator phoneValidator = new PhoneValidator();
        assertTrue(phoneValidator.changeToLithuanianPrefix("+370"));
    }

    @Test
    public void TestPhoneAddNewPhoneCodesRules(){
        PhoneValidator phoneValidator = new PhoneValidator();
        assertTrue(phoneValidator.addNewPhoneRules("lv", 87));
    }

    // Email test requirements
    @Test
    public void TestEmailHasEtaSymbol(){
        EmailValidator emailValidator = new EmailValidator();
        assertTrue(emailValidator.hasEtaSymbol("P@ssword"));
    }

    @Test
    public void TestEmailHasOnlyRightSymbols(){
        EmailValidator emailValidator = new EmailValidator();
        assertTrue(emailValidator.hasOnlyRightSymbols("email@gmail.com"));
    }

    @Test
    public void TestEmailHasRightDomain(){
        EmailValidator emailValidator = new EmailValidator();
        assertTrue(emailValidator.hasRightDomain("email@gmail.com"));
    }
}
