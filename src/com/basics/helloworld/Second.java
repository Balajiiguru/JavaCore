package com.basics.helloworld;

public class Second extends Main{

      int age=15;
    public Second(int age, String name, double salary) {
        super(age, name, salary);
    }

    public Second(){

    }

    void sum(int a,int b){

        System.out.println(a-b);

    }

    public static void main(String[] args) {

        Main m = new Second(12,"Balaji",12.0);
        int c=m.age;
        int d=( (Second) m).age;

        //int d=s.age;
        //s.sum1(2,3);
        //s.sum(2,3);
        System.out.println(c);
        System.out.println(d);


    }
}

