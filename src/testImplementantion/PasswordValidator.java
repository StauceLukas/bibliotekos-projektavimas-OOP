package testImplementantion;

public class PasswordValidator {

    public boolean validate(String data){
        boolean upperCaseValue = DoesNotHaveUppercase_False(data);
        boolean IsNotValidLength = IsNotOfValidLength_False(data);
        boolean specialSymbolValue = DoesNotHaveSpecialCharacters_False(data);

        return (upperCaseValue && IsNotValidLength && specialSymbolValue);
    }

    public boolean ValidPassword_True(String data) {
        boolean upperCaseValue = DoesNotHaveUppercase_False(data);
        boolean IsNotValidLength = IsNotOfValidLength_False(data);
        boolean specialSymbolValue = DoesNotHaveSpecialCharacters_False(data);

        return (upperCaseValue && IsNotValidLength && specialSymbolValue);
    }

    public boolean IsNotOfValidLength_False(String data){
        int minimalLength = 6;
        return minimalLength < data.length();
    }


    public boolean DoesNotHaveUppercase_False(String data) {
        char ch;
        boolean upperCaseFlag = false;
        for(int i=0 ;i < data.length(); i++) {
            ch = data.charAt(i);
            if(Character.isUpperCase(ch)) {
                upperCaseFlag = true;
                break;
            }
        }
        return upperCaseFlag;
    }


    public boolean DoesNotHaveSpecialCharacters_False(String data) {
        char ch;
        boolean specialCharFlag = false;
        for(int i=0;i < data.length();i++) {
            ch = data.charAt(i);
            if (ch == '$' || ch == '!' || ch == '@') {
                specialCharFlag = true;
                break;
            }
        }
        return specialCharFlag;
    }
}
