package com.basics.primitivetypes;

public class EmailValidation {

    /*
    Email Validation. Output is false if the validation fails else true. String input1="test@gmai.com"
    1)@ & : should be present;
    2)@ & . should not be repeated;
    3)there should be four charcters between @ and .;
    4)there should be at least 3 characters before @ ;
    5)the end of mail id should be .com; Expected Output=true
     */

    public static void main(String[] args) {
        System.out.println(validation("balajiiguru@gmai.com"));
    }

    public static boolean validation(String email){

      boolean result=true;

      //1)@ & : should be present;
      if (!(email.contains("@")&& email.contains("."))) result=false;
      if(!(email.indexOf("@")==email.lastIndexOf("@"))) result=false;

      //2)@ & . should not be repeated;
      if(!(email.indexOf(".")==email.lastIndexOf("."))) result=false;
      if(!(email.indexOf("@")==email.lastIndexOf("@"))) result=false;

      // 3)there should be four characters between @ and .;
      int startIndex=email.indexOf("@")+1;
      int endIndex=email.indexOf(".");
      String provider=email.substring(startIndex,endIndex);
      if(!(provider.length()==4)) result=false;


      // 4)there should be atleast 3 characters before @ ;
        endIndex=email.indexOf(".");
        String domain=email.substring(0,endIndex);
        if(!(provider.length()>=3)) result=false;

        //the end of mail id should be .com;
        startIndex=email.indexOf(".");
        String suffixWord=email.substring(startIndex);
        if(!(suffixWord.equals(".com"))) result=false;

      return result;
    }

}


