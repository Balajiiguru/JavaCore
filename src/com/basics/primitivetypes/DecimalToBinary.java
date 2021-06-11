package com.basics.primitivetypes;

public class DecimalToBinary {
    //Convert decimal to binary Sample input : 12 Sample output : 1100

    public static void main(String[] args) {
        convertToBinary1(12);
        System.out.println(convertToBinary(12));
    }

    public static String convertToBinary(int a) {
        Integer b = 123;
        return Integer.toBinaryString(a);
    }

    public static void convertToBinary1(int decimal) {
        int[] binary = new int[40];
        int index = 0;
        while (decimal > 0) {

            binary[index++] = decimal % 2;
            decimal = decimal / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }
}
