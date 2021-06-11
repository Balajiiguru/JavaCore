package com.basics.primitivetypes;

public class RemoveDuplicates {

    public static void main(String[] args) {
        getUnique("helolWorld");
    }

    public static void getUniqueChar(String s){
        String unique="";
        for (int i = 0; i <s.length() ; i++) {
            boolean flag=false;
            for (int j = i+1; j < s.length(); j++) {
                if( s.charAt(i)==s.charAt(j)){
                    flag=true;
                    break;
                }

            }
         if(!flag){
             unique=unique+ s.charAt(i);
             }
        }
        System.out.println(unique);
    }

    public static void getUnique(String s){
        int a[] =new int[127];
        for (int i = 0; i < s.length(); i++) {
            int temp=s.charAt(i);
            a[temp]++;
        }
        for (int j = 0; j < a.length; j++){

            if(a[j] == 1) System.out.print((char) j);

        }

    }
}
