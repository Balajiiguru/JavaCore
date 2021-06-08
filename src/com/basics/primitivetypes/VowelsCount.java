package com.basics.primitivetypes;
import java.util.Arrays;

public class VowelsCount {

    public static void main(String[] args) {

        System.out.println(getVowelsCount("aecAb"));
    }

    private static int getVowelsCount(String s) {
        String newString=removeDuplicates(s.toLowerCase());
        int count = 0;
        for (int i = 0; i < newString.length(); i++) {
            char c = newString.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                count++;
            }
        }
        return count;
    }


    private static String removeDuplicates(String inputString) {
        StringBuilder ns = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            boolean duplicateExist = false;
            for (int j = i + 1; j < inputString.length(); j++) {
                if (inputString.charAt(i) == inputString.charAt(j)) {
                    duplicateExist = true;
                    break;
                }

            }
            if (!duplicateExist) {
                ns.append(inputString.charAt(i));
            }
        }
        return ns.toString();
    }

    private static String removeDuplicates2(String inputString) {
        StringBuilder s = new StringBuilder();
        char[] c=inputString.toCharArray();
        Arrays.sort(c);
        for (int i = 1; i < c.length ; i++) {
            if(c[i]!= c[i-1]){
                s.append(c);
            }
        }
        return s.toString();
    }

}
