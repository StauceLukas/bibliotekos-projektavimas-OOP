package testImplementantion;

public class EmailValidator {

    public boolean validate(String data){
        return false;
    }

    public boolean validate_ValidEmail_True() {
        return true
    }


    public boolean DoesNotHaveAtSign_False(String data) {
       return data.contains("@");
    }


   public boolean DoesNotHaveRecipientName_False(String data) {
       int nameLength = 0;

       for(int i = 0; i < data.length(); i++){
           nameLength++;
           if (data.charAt(i) == '@'){
               break;
           }
       }

       if(nameLength > 0){
           return false;
       }
       else{
           return true;
       }
       //  veikia  bet blogai
   }


     public boolean DoesNotHaveDomainName_False(String data) {
         int nameLength = 0;
         int domainNameLength = 0;

         for(int i = 0; i < data.length(); i++){
             nameLength++;
             if (data.charAt(i) == '@'){
                 break;
             }
         }

         for(int i = nameLength; i < data.length(); i++){
             domainNameLength++;
             if (data.charAt(i) == '.'){
                 break;
             }
         }

         if(nameLength > 0){
             return false;
         }
         else{
             return true;
         }
    }

    public boolean DoesNotHaveTopLevelDomain_False() {
        return false;
    }


    public boolean HasSpecialCharacterInFront_False() {
        return false;
    }


    public boolean HasSpecialCharacterInBack_False() {
        return false;
    }

    public boolean HasConsecutiveSpecialCharacters_False() {
        return false;
    }


}
