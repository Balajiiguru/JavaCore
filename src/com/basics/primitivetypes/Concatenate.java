package com.basics.primitivetypes;

import java.util.Arrays;

public class Concatenate {

    //Concatenate the character in a given position.
    // If there is no character in a given position place "$" sign. input1[]={"abc","da","ram"};
    // input2=3; hint : 3rd character is "c" in "abc" 3rd character is not present in "da",
    // so place "$" 3rd character is "m" in "ram" concate all the characters to a single string "c$m" o/p string ="c$m";
    public static void main(String[] args) {
        concatenateString(new String[]{"abc","da","ram"},3);
    }

    static void concatenateString(String a[], int l) {

        for (int i = 0; i < l; i++) {
            if (a[i].length() < l) {
                int diff = l - a[i].length();
                for (int j = 0; j < diff; j++) {
                    a[i] = a[i] + "$";
                }
            }
        }
        String output="";
        for (int i = 0; i < l; i++) {
            output=output.concat(String.valueOf(a[i].charAt(2)));

        }
        System.out.println(output);
    }
}
