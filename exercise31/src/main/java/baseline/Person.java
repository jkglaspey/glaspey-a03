/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

import java.util.Scanner;

public class Person {

    //create class Scanner
    private static final Scanner in = new Scanner(System.in);

    //create instance variables
    private final int age;
    private final int restingHR;

    //create public constructor
    public Person(int age, int restingHR) {
        this.age = age;
        this.restingHR = restingHR;
    }

    //create default constructor
    public Person() {
        age = 0;
        restingHR = 0;
    }

    //create method to get age
    public int getAge() { return age; }

    //create method to get resting heart rate
    public int getRestingHeartRate() { return restingHR; }

    //create method to read age from user
    public static int getAgeFromUser() {

        //declare variable for storing result
        int x;

        //loop to ensure input is valid
        do{
            //prompt for age
            System.out.print("Enter your age: ");
            String temp = in.nextLine();

            //verify the data is numerical
            x = isNumeric(temp);
        } while (x == 0);

        //input is valid
        return x;
    }

    //create method to read resting heart rate from user
    public static int getRestingHeartRateFromUser() {

        //declare variable for storing result
        int x;

        //loop to ensure input is valid
        do{
            //prompt for heart rate
            System.out.print("Enter your resting heart rate: ");
            String temp = in.nextLine();

            //verify the data is numerical
            x = isNumeric(temp);
        } while (x == 0);

        //input is valid
        return x;
    }

    //create method to determine if a string is numeric
    public static int isNumeric(String s) {
        //try to parse int
        //if error is thrown, then return 0
        //if no error, return 1

        try{
            return Integer.parseInt(s);
        }

        //error is thrown, input is not numeric
        catch(NumberFormatException e) {
            System.out.print("Please enter a numeric response!\n");
            return 0;
        }
    }

    //create method to calculate the target heart rate
    //rounds the answer to the nearest whole number
    public int calculateTargetHeartRate(int intensity) {
        return (int)Math.round((((220.0 - age) - restingHR) * (intensity / 100.0)) + restingHR);
    }

    //create method to print target heart rates by percentage
    public void printTargetHeartRates() {

        //print restingHR and age at top
        System.out.printf("%nResting Heart Rate: %-10d Age: %d",restingHR,age);

        //print table headers for Intensity and Rate
        System.out.printf("%n%n%-15s | %-10s","Intensity","Rate");
        System.out.printf("%n%-15s | %-10s","---------------","--------------");

        //loop for (95 - 55) / 5
        for(int i = 55; i < 100; i += 5) {

            //calculate target heart rate and print
            System.out.printf("%n%-2d%% %-11s | %3d bpm",i,"",calculateTargetHeartRate(i));
        }
    }
}
