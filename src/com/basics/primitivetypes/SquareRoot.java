package com.basics.primitivetypes;

public class SquareRoot {
    //Square root calculation ((x1+x2)(x1+x2))+((y1+y2)(y1+y2)) o/p should be rounded of to int;
    // Sample input: double x1=5; double x2=6; double y1=8; double y2=3; output : 15
    public static void main(String[] args) {

        System.out.println(getSquareRoot(5,6,8,3));
    }

   public static int getSquareRoot(int x1,int x2,int y1,int y2){

       int sum=((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2));
       int result= (int) Math.sqrt(sum);
       return result;


   }

}
