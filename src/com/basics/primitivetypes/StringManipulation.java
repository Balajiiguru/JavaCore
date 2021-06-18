package com.basics.primitivetypes;

import java.util.Arrays;
import java.util.Locale;

public class StringManipulation {

    //Given a method with two strings as input.
    // Write code to modify the first string such that all characters are replace by plus sign(=) except the characters which are present in the second string.
    // That is, if one or more characters of first string appear in second string, they will not be replace by +.
    // Return the modified string as output. Note-ignore case.
    //
    //Example: input1 = New York input2 = New Jersy output = New Y+r+

    public static void main(String[] args) {
      int s =100;
      String s1=String.format("%05d",s);
        //System.out.println(s1);
        //stringManipulation();
        encryptString("curioszy");

    }

    public static void stringManipulation(){

        String input1="New york".toLowerCase(Locale.ROOT);
        String input2="New jersY".toLowerCase(Locale.ROOT);


        for(int i = 0;i <input1.length();i++ ){
            if(input2.indexOf(input1.charAt(i))==-1){
                input1=input1.replace(input1.charAt(i),'+');

            }

        }
        System.out.println(input1);

    }

    public static void encryptString(String input){
        byte[] b=input.getBytes();
        System.out.println(Arrays.toString(b));
        for(int i = 0;i < b.length;i++){
            if(i%2 == 0 && b[i]!=122)  b[i]++;
            if(i%2 == 0 && b[i]==122) b[i] = 97;

        }

        String encryptedString=new String(b);
        System.out.println(encryptedString);
    }

}
