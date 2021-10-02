package testImplementantion;

public class PasswordValidator {

    public boolean validate(String data){
        boolean upperCaseValue = DoesNotHaveUppercase_False(data);

        if(!upperCaseValue){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean ValidPassword_True() {
        return true;
    }



    public boolean IsNotOfValidLength_False(String data){
        int length = 8;
        return length <= data.length();
    }


    public boolean DoesNotHaveUppercase_False(String data) {
        char ch;
        boolean upperCaseFlag = false;
        for(int i=0;i < data.length();i++) {
            ch = data.charAt(i);
            if(Character.isUpperCase(ch)) {
                upperCaseFlag = true;
            }
            if(upperCaseFlag)
                return true;
        }
        return false;
    }


    public boolean DoesNotHaveSpecialCharacters_False(String data) {
        char ch;
        boolean specialCharFlag = false;
        for(int i=0;i < data.length();i++) {
            ch = data.charAt(i);
            if(ch == '$') {
                specialCharFlag = true;
            }
            if(specialCharFlag)
                return true;
        }
        return false;
    }

}
