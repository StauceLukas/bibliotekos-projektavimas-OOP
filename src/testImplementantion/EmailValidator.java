package testImplementantion;


public class EmailValidator {

    public boolean validate(String data){
        boolean haveETASign = DoesNotHaveAtSign_False(data);
        boolean recipientName = DoesNotHaveRecipientName_False(data);
        boolean domainName = DoesNotHaveDomainName_False(data);
        boolean topLevelDomain = DoesNotHaveTopLevelDomain_False(data);
        boolean specialCharInFront = HasSpecialCharacterInFront_False(data);
        boolean specialCharInBack = HasSpecialCharacterInBack_False(data);
        boolean ConsecutiveSpecialChar = HasConsecutiveSpecialCharacters_False(data);

        return (haveETASign && recipientName && domainName && topLevelDomain && specialCharInBack && specialCharInFront && ConsecutiveSpecialChar);


    }

    public boolean ValidEmail_True(String data) {
        boolean haveETASign = DoesNotHaveAtSign_False(data);
        boolean recipientName = DoesNotHaveRecipientName_False(data);
        boolean domainName = DoesNotHaveDomainName_False(data);
        boolean topLevelDomain = DoesNotHaveTopLevelDomain_False(data);

        return haveETASign || recipientName || domainName || topLevelDomain;

    }



    public boolean DoesNotHaveAtSign_False(String data) {
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == '@') {
                return true;
            }
        }
        return false;
    }


   public boolean DoesNotHaveRecipientName_False(String data) {
       int nameLength = 0;

       for(int i = 0; i < data.length(); i++){
           if (data.charAt(i) == '@'){
               break;
           }
           nameLength++;
       }
       return nameLength <= 0;

   }


     public boolean DoesNotHaveDomainName_False(String data) {
         int nameLength = 0;
         int domainNameLength = 0;

         for(int i = 0; i < data.length(); i++){
             if (data.charAt(i) == '@'){
                 break;
             }
             nameLength++;
         }

         for(int i = (nameLength + 1); i < data.length(); i++){
             if (data.charAt(i) == '.'){
                 break;
             }
             domainNameLength++;
         }

         return domainNameLength <= 0;
    }

    public boolean DoesNotHaveTopLevelDomain_False(String data) {
        int topLevelDomainLength = 0;
        boolean hasTopLevelDomain = true;

        for(int i = data.length() - 1; i > 0; i-- ){
            if (data.charAt(i) == '.'){
                break;
            }

            if (data.charAt(i) == '@'){
                hasTopLevelDomain = false;
                break;
            }
            topLevelDomainLength++;

        }
        return (topLevelDomainLength > 0 && hasTopLevelDomain);
    }


    public boolean HasSpecialCharacterInFront_False(String data) {
        return data.charAt(0) == '!' || data.charAt(0) == '@';
    }


    public boolean HasSpecialCharacterInBack_False(String data) {
        int lastLetterIndex = data.length() - 1;
        return data.charAt(lastLetterIndex) == '!' || data.charAt(lastLetterIndex) == '@';
    }

    public boolean HasConsecutiveSpecialCharacters_False(String data) {
        boolean hasConsecutiveCharacters = false;
        for (int i = 0; i < data.length(); i++) {

            if (data.charAt(i) == '.' && data.charAt(i + 1) == '.') {
                hasConsecutiveCharacters = true;
                break;
            }

        }
        return hasConsecutiveCharacters;
    }

}
