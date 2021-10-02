package com.company;

import org.junit.jupiter.api.Test;
import testImplementantion.EmailValidator;
import testImplementantion.PasswordValidator;
import testImplementantion.PhoneNumberValidator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class ImplementationTest {

    @Test
   public void validate_ValidEmail_True() {
        assertTrue(new EmailValidator().validate("name.surname@email.com"));
    }

    @Test
   public void validate_DoesNotHaveAtSign_False() {
        assertFalse(new EmailValidator().validate("name.surnamemail.com"));
    }

  @Test
    public void validate_DoesNotHaveRecipientName_False() {
        assertFalse(new EmailValidator().DoesNotHaveRecipientName_False("@email.com"));
    }


    @Test
    public void validate_DoesNotHaveDomainName_False() {
        assertFalse(new EmailValidator().validate("name.surname@.com"));
    }

    @Test
    public void validate_DoesNotHaveTopLevelDomain_False() {
        assertFalse(new EmailValidator().validate("name.surname@email"));
    }

    @Test
    public void validate_HasSpecialCharacterInFront_False() {
        assertFalse(new EmailValidator().validate("!name.surname@email.com"));
    }

    @Test
    public void validate_HasSpecialCharacterInBack_False() {
        assertFalse(new EmailValidator().validate("name.surname@email.com!"));
    }

    @Test
    public void validate_HasConsecutiveSpecialCharacters_False() {
        assertFalse(new EmailValidator().validate("name..surname@email"));
    }



    @Test
    public void validate_DoesNotHaveUppercase_False() {
        assertFalse(new PasswordValidator().validate("alotofcars!@"));
    }

    @Test
    public void validate_IsNotOfValidLength_False() {
        assertFalse(new PasswordValidator().IsNotOfValidLength_False("ALjgt@"));
    }


        @Test
    public void validate_ValidPhoneNumber_True() {
        assertTrue(new PhoneNumberValidator().validate("+37061234567"));
    }

    @Test
    public void validate_HasOtherCharactersApartFromNumbers_False() {
        assertFalse(new PhoneNumberValidator().validate("+370612A4567"));
    }

    @Test
    public void validate_NumberBeginsWith8_True() {
        assertTrue(new PhoneNumberValidator().NumberBeginsWith8_True("861234567"));
    }
}


    @Test
    public void validate_NumberBeginsWithDifferentNumber_False() {
        assertFalse(new PhoneNumberValidator().validate("761234567"));
    }

    @Test
    public void validate_IsTooShort_False() {
        assertFalse(new PhoneNumberValidator().validate("+3706123456"));
    }

    @Test
    public void validate_IsTooLong_False() {
        assertFalse(new PhoneNumberValidator().validate("+370612345678"));
    }

    @Test
    public void validate_PrefixIsInvalid_False() {
        assertFalse(new PhoneNumberValidator().validate("+37161234567"));
    }

    @Test
    public void validate_AddLatvianPrefix_True() {
        assertTrue(new PhoneNumberValidator().validate("+37161234567"));
    }

}