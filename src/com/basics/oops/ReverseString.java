package com.basics.oops;

public class ReverseString {


    public static void main(String[] args) {

        System.out.println(mirrorString("EARTH"));
    }

    public static String mirrorString(String input) {
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }
        return (input + "|" + reverse);

    }
}
