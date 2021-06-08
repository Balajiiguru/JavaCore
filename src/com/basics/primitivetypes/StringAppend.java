package com.basics.primitivetypes;

public class StringAppend {

    public static void main(String[] args) {
        System.out.println(getString(new String[]{"aa","b","cc","ddd"}));
    }

    public static String getString(String[] input) {
        String newString = new String();
        for (String s : input) {
            newString=newString.concat(s);
        }

        return newString;
    }
}