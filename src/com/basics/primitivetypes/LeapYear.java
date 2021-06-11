package com.basics.primitivetypes;

public class LeapYear {

    //Calculate whether given year as leap or not;
    // Sample input: int year = 2020; Sample output: boolean isLeapYear = true;

    public static void main(String[] args) {
        LeapYear.isLeapYear(2021);

    }

    public static boolean isLeapYear(int year){
       boolean result = year %4 ==0 ? true : false;
        return result;
    }


}
