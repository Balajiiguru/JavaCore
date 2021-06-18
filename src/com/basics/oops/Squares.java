package com.basics.oops;


/*
Create a class with a method to find the difference between the sum of the squares and the square of the sum of the first n natural numbers.
Method Name - calculateDifference
Argument - int n
Return Type - int sum
Logic - Find the difference between the sum of the squares of the first n natural numbers and the square of their sum.
For Example if n is 10,you have to find (1^2+2^2+3^2+….9^2+10^2)- (1+2+3+4+5…+9+10)^2
 */
public class Squares {

    public static void main(String[] args) {

        Squares s= new Squares();
        System.out.println(s.sumOfSquares(5)-s.squaresOfSum(5));
    }


    public int sumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i < n + 1; i++) {

            sum = sum + i * i;

        }
        return sum;
    }

    public int squaresOfSum(int n) {
        int sum = 0;
        for (int i = 1; i < n + 1; i++) {

            sum = sum + i;
        }
        return sum * sum;
    }
}
