/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

public class Solution31 extends Person {

    /*
    Create a program that prompts for your age and your resting heart rate. Use the Karvonen formula to determine the
    target heart rate based on a range of intensities from 55% to 95%. Generate a table with the results as shown in the
     example output.
     */

    public static void main(String[] args) {

        //create variables to store age and resting heart rate
        int age;
        int restingHeartRate;

        //call methods to read user input
        age = getAgeFromUser();
        restingHeartRate = getRestingHeartRateFromUser();

        //create object to store information about person
        Person me = new Person(age, restingHeartRate);

        //print the table
        me.printTargetHeartRates();
    }

}
