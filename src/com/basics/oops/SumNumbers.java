package com.basics.oops;

/*Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5.
Method Name - calculateSum
Argument - int n
Return Type - int sum
Logic - Calculate the sum of first n natural numbers which are divisible by 3 or 5.*/

public class SumNumbers {

    public static void main(String[] args) {

        SumNumbers s=new SumNumbers();
        s.getSum(10);
    }


    public int getSum(int n) {
        int sum = 0;
        for (int i = 1; i < n + 1; i++) {
            if (i % 3 == 0 || i % 5 == 0) sum = sum + i;
        }
        System.out.println(sum);
        return sum;
    }

}
