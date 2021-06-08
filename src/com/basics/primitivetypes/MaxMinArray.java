package com.basics.primitivetypes;

import java.util.Arrays;

public class MaxMinArray {

    public static void main(String[] args) {
        System.out.println(getMaxMinCount(new int[]{10, 5, 18, 4}));
    }

    public static int getMaxMinCount(int a[]){
        Arrays.sort(a);
        int min=a[0];
        int max=a[a.length-1];
        return min+max;
    }
}
