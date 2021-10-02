package testImplementantion;

public class PhoneNumberValidator {

    public boolean validate(String data){
        return true;
    }

    public boolean ValidPhoneNumber_True() {
        return true;
    }

    public boolean NumberBeginsWith8_True(String data) {
        return data.charAt(0) == '8';
    }


    public boolean NumberBeginsWithDifferentNumber_False(String data) {
        if (data.charAt(0) != '8'){
            return false;
        }
        else return data.charAt(0) == '+';
    }


    public boolean IsTooShort_False(String data) {
        int withoutPrefixLength = 9;
        int withPrefixLength = 12;

        if(data.length() == withoutPrefixLength || data.length() == withPrefixLength){
            return true;
        }
        else{
            return false;
        }
    }


    public boolean IsTooLong_False(String data) {
        int withoutPrefixLength = 9;
        int withPrefixLength = 12;

        if(data.length() == withoutPrefixLength || data.length() == withPrefixLength){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean PrefixIsInvalid_False(String data) {
        String prefix = "+370";
        return true;
    }

    public boolean validate_AddLatvianPrefix_True(String data1, String data2) {
        return true;
    }

    public void addNewCountryPrefix(String data, int data1){

    }

}
