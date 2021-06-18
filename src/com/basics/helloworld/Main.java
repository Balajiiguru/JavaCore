package com.basics.helloworld;


import java.math.BigInteger;
import java.util.Objects;
import java.util.Scanner;

public class Main {



    int age;
    String name;
    double salary;

    public Main() {

    }


    public Main(int age) {
        this.age = age;
    }

    public Main(int age, String name) {
        this(age);
        this.name = name;
    }

    public Main(int age, String name, double salary) {
        this(age,name);
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Main{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    void sum1(int a,int b){

        System.out.println(a+b);

    }

    public static void main(String[] args) {


        System.out.println("Hello World");
        Main main=new Main(28,"Balaji",12000.55);
        System.out.println(main.toString());


    }
}
