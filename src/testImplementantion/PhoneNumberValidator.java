package testImplementantion;

import java.util.HashMap;

public class PhoneNumberValidator {

    HashMap<String, String> countryPhoneCode = new HashMap<String, String>();

    public boolean ValidPhoneNumber_True(String data) {
        return true;
    }

    public boolean NumberBeginsWith8_True(String data) {
        return data.charAt(0) == '8';
    }


    public boolean NumberBeginsWithDifferentNumber_False(String data) {

        return !(data.charAt(0) == '8' || data.charAt(0) == '+');
    }


    public boolean IsTooShort_False(String data) {
        int minimumLength = 9;
        return data.length() < minimumLength;
    }

    public boolean IsTooLong_False(String data) {
        int maximumLength = 13;
        return data.length() > maximumLength;
    }

    public boolean PrefixIsInvalid_False(String data) {
        String prefix = "+370";
        return data.contains(prefix);
    }


    public boolean HasOtherCharactersApartFromNumbers_False(String data) {
        boolean hasLetters = false;

        for (int i = 0; i < data.length(); i++) {

            if (Character.isLetter(data.charAt(i))) {
                hasLetters = true;
                break;
            }
        }
        return hasLetters;
    }

    public boolean addNewCountryPrefix(String data, String data1) {

        if (countryPhoneCode.containsKey(data)){
            return false;
        }
        else{
            countryPhoneCode.put(data, data1);
            return true;
        }

    }


    public boolean AddPrefix_True(String data1, String data2) {
        return addNewCountryPrefix(data1, data2);
    }



    public boolean validate(String data){
        boolean NumberBeginsWith8 = NumberBeginsWith8_True(data);
        boolean NumberBeginsWithDiffNumber = NumberBeginsWithDifferentNumber_False(data);
        boolean tooShort = IsTooShort_False(data);
        boolean tooLong = IsTooLong_False(data);
        boolean invalidPrefix = PrefixIsInvalid_False(data);
        boolean otherCharApartFromNumbers = HasOtherCharactersApartFromNumbers_False(data);

        return (NumberBeginsWith8 && tooShort && invalidPrefix && NumberBeginsWithDiffNumber && tooLong
        && otherCharApartFromNumbers);
    }
}
