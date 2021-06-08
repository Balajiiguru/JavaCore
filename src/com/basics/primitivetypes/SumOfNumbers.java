package com.basics.primitivetypes;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println(sum(new String[]{"10ab", "cd5", "aa18", "AB4"}));

    }

    public static int sum(String[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length(); j++) {
                char c = input[i].charAt(j);
                if (Character.isDigit(c)) {
                    int value=Integer.parseInt(String.valueOf(c));
                    sum=sum+value;
                }
            }

        }
        return sum;
    }


}
