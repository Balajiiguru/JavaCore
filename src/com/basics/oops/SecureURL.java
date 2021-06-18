package com.basics.oops;

public class SecureURL {

    String Secureurl;

    public SecureURL(String Secureurl) {

     this.Secureurl= Secureurl;
    }

    public static void main(String[] args) {

        SecureURL s =new SecureURL("https://google.com");
        s.isSecureURL();
    }

    boolean isSecureURL(){

        String protocal=(Secureurl.split(":"))[0];
        boolean result = protocal.equals("https") ? true:false;
        System.out.println(result);
        return result;
    }
}
