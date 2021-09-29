/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

public class Solution29 {

    /*
    Write a quick calculator that prompts for the rate of return on an investment and calculates how many years it
    will take to double your investment.
     */

    //create method to ask the user for input
    public static int askUserForRate() {

        //loop
        //"try" to ask user for rate as non-zero int
        //if successful, return int
        //catch InputMismatchException, continue loop
    }

    //create method to calculates the rate of return
    public static int calculateRate(int r) {

        //calculate rate as a double
        //round up and return result
    }

    //create method to print the resultant number of years
    public static void printYears(int years) {
        //print the amount of years
    }

    public static void main(String[] args) {

        //create an int to store the rate of return
        int r;
        //create an int to store the number of years to pay to double an investment
        int years;

        //read rate of return from user
        r = askUserForRate();

        //calculate the number of years
        years = calculateRate(r);

        //print the resultant number of years
        printYears(years);
    }
}
