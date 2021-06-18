package com.basics.oops;


/*Cricket Commentary Automation Hope you would have used a cricket website that provides a ball by ball text commentary.
 Write a program to automate the text messages for each delivery.
 Initially we must automate the below two display variations:
        Option 1: Batsman and Bowler details of the delivery
        Option 2: Number of runs scored in the delivery Based on user’s input,
        either the Option 1 or Option 2 details will be displayed to the user.
        Note: Create a class named Delivery. There are no attributes in this class.
        Include the following methods in the Delivery class. •
        void displayDeliveryDetails(String bowler, String batsman)
        --- In this method, print the last names of the bowler and batsman of that particular delivery. •
        void displayDeliveryDetails(Long runs) --- In this method, display the run details of that delivery.
        If the number of runs scored in that delivery is 6 or 4 then display “It is a Sixer.” or “It is a boundary.” along with the number of runs,
        else print only the number of runs.
        Create a Main class to read the user inputs and invoke the displayDeliveryDetails() with appropriate parameters.*/

public class Delivery {


    public static void main(String[] args) {

        Delivery d= new Delivery();
        if(args.length==2)  d.displayDeliveryDetails("Ravichandran Aswin" ,"Virat Kohli");
        else if(args.length==2) d.displayDeliveryDetails(6);
        else System.out.println("invalid input");

    }



    void displayDeliveryDetails(String bowler, String batsman){

        System.out.println("Bowler Name :"+bowler.split(" ")[1]);
        System.out.println("Batsman Name :"+batsman.split(" ")[1]);

    }

    void displayDeliveryDetails(int runs){

        if(runs==4 ) System.out.println("it is a boundary");
        if(runs==6 ) System.out.println("it is a sixer");
        System.out.println("Number of runs scored :" + runs);


    }

}
