package com.basics.primitivetypes;

public class NumberOfWords {
    /*
    Find the number of words are of given length Input1:{“aa”,”b”,”cc”,”ddd”} Input2:2 Output1:2
    Input1:{“aa”,”b”,”cc”,”ddd”} Input2:1 Output1:1
     Input1:{“aa”,”b”,”cc”,”ddd”} Input2:3 Output1:1
     */
    public static void main(String[] args) {
        System.out.println(getCount(new String[]{"aa","b","cc","ddd"},2));
    }

    public static int getCount(String[] s, int number) {

        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() == number) count++;
        }
        return count;
    }

}
