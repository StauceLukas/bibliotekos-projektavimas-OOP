package com.company;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import testImplementantion.EmailValidator;
import testImplementantion.PasswordValidator;
import testImplementantion.PhoneNumberValidator;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class ImplementationTest {

        private static EmailValidator emailValidator;
        private static PasswordValidator passwordValidator;
        private static PhoneNumberValidator phoneNumberValidator;

        @BeforeAll
        static void prepareTest(){
            emailValidator = new EmailValidator();
            passwordValidator = new PasswordValidator();
            phoneNumberValidator = new PhoneNumberValidator();
        }


    // Password tests
    @Test
    public void validate_ValidPassword_True() {
        assertTrue(new PasswordValidator().ValidPassword_True("p@assworD123"));
    }

    @Test
    public void validate_DoesNotHaveUppercase_False() {
        assertFalse(new PasswordValidator().validate("p@ssword123"));
    }

    @Test
    public void validate_IsNotOfValidLength_False() {
        assertFalse(passwordValidator.validate("P@ss"));
    }

    @Test
    public void validate_DoesNotHaveSpecialCharacters_False() {
        assertFalse(passwordValidator.validate("Password123"));
    }

    @Test
   public void validate_ValidEmail_True() {
        assertFalse(emailValidator.validate("name.surname@email.com"));
    }

    @Test
   public void validate_DoesNotHaveAtSign_False() {
        assertFalse(emailValidator.validate("name.surnameemail.com"));
    }

  @Test
    public void validate_DoesNotHaveRecipientName_False() {
        assertFalse(emailValidator.validate("g@email.com"));
    }


    @Test
    public void validate_DoesNotHaveDomainName_False() {
        assertFalse(emailValidator.validate("name.surname@n.com"));
    }

    @Test
    public void validate_DoesNotHaveTopLevelDomain_False() {
        assertFalse(emailValidator.validate("name.surname@email.co"));
    }

    @Test
    public void validate_HasSpecialCharacterInFront_False() {
        assertFalse(emailValidator.HasSpecialCharacterInFront_False("name.surname@email.com!"));
    }

    @Test
    public void validate_HasSpecialCharacterInBack_False() {
        assertFalse(emailValidator.HasSpecialCharacterInBack_False("!name.surname@email.com"));
    }

    @Test
    public void validate_HasConsecutiveSpecialCharacters_False() {
        assertFalse(emailValidator.HasConsecutiveSpecialCharacters_False("name.surname@email"));
    }


    // Phone tests
    @Test
    public void validate_ValidPhoneNumber_True() {
        assertTrue(phoneNumberValidator.ValidPhoneNumber_True("+37061234567"));
    }

    @Test
    public void validate_HasOtherCharactersApartFromNumbers_False() {
        assertFalse(phoneNumberValidator.validate("+37061A4567"));
    }

    @Test
    public void validate_NumberBeginsWith8_True() {
        assertFalse(phoneNumberValidator.validate("761234567"));
    }

    @Test
    public void validate_NumberBeginsWithDifferentNumber_False() {
        assertFalse(phoneNumberValidator.validate("761234567"));
    }

    @Test
    public void validate_IsTooShort_False() {
        assertFalse(phoneNumberValidator.validate("+3712345"));
    }

    @Test
    public void validate_IsTooLong_False() {
        assertFalse(phoneNumberValidator.validate("+37123456789"));
    }

    @Test
    public void validate_PrefixIsInvalid_False() {
        assertFalse(phoneNumberValidator.validate("+3701234567"));
    }

/*    @Test
    public void validate_AddLatvianPrefix_True() {
        assertTrue(new PhoneNumberValidator().validate("+37161234567"));
    }*/

}
