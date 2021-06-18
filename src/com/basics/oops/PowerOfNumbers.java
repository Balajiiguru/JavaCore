package com.basics.oops;

public class PowerOfNumbers {

    public static void main(String[] args) {
        System.out.println(getSum(new int[] {3,6,2,1}));
    }


    public static int getSum(int a[]){
        double sum=0;
        for (int i = 0; i < a.length; i++) {
            System.out.println(Math.pow(a[i],i));
            sum=sum+Math.pow(a[i],i);
        }
        return (int) sum;
    }

}
