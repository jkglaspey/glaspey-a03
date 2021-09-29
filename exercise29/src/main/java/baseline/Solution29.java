/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

import java.util.Scanner;

public class Solution29 {

    /*
    Write a quick calculator that prompts for the rate of return on an investment and calculates how many years it
    will take to double your investment.
     */

    //create class Scanner
    private static final Scanner in = new Scanner(System.in);

    //create method to ask the user for input
    public static int askUserForRate() {

        //create int to store user input
        int input;

        //create string to user store input
        String temp;

        do {
            //gather input as string
            System.out.print("What is the rate of return? ");
            temp = in.nextLine();

            //verify the input is correct
            input = isNonZeroInt(temp);
        } while (input <= 0);

        //test passed
        return input;
    }

    //create method to verify the data is a non-zero int
    private static int isNonZeroInt(String s) {

        //create int that stores result
        int x;

        //try to get non-zero input from the user
        try {
            x = Integer.parseInt(s);
        }

        //catch non-numeric answers, fail the test
        catch(NumberFormatException e) {
            x = 0;
        }

        //failed the test
        if(x <= 0) System.out.print("Sorry. That's not a valid input. \n");
        return x;
    }

    //create method to calculates the number of years to double an investment
    public static int calculateYears(int r) {

        //calculate years
        return (int)(Math.ceil(72.0 / r));
    }

    //create method to print the resultant number of years
    public static void printYears(int years) {

        //print the amount of years
        System.out.printf("It will take %d years to double your initial investment.",years);
    }

    public static void main(String[] args) {

        //create an int to store the rate of return
        int r;
        //create an int to store the number of years to pay to double an investment
        int years;

        //read rate of return from user
        r = askUserForRate();

        //calculate the number of years
        years = calculateYears(r);

        //print the resultant number of years
        printYears(years);
    }
}
