/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

import java.util.Random;
import java.util.Scanner;

public class Solution33 {

    /*
    Create a Magic 8 Ball game that prompts for a question and then displays either "Yes," "No," "Maybe," or "Ask again
    later."
     */

    //create class Scanner
    private static final Scanner in = new Scanner(System.in);

    //create class Random
    private static final Random random = new Random();


    //create method to return a random number between 0 and 3
    public static int generateRandomNumber() {
        return random.nextInt(4);
    }

    //create method that prompts user to enter a string but not store it >:)
    public static void askUserForQuestion() {
        System.out.print("What is your question?\n > ");
        in.nextLine();
    }

    //create method that takes a list of strings and an index and returns the specific string
    public static String printRandom(String[] list, int index) {
        return list[index];
    }

    public static void main(String[] args) {

        //create a list of responses
        String[] list = {"Yes.","No.","Maybe.","Ask again later."};

        //generate random number between 0 and 3
        int randomIndex = generateRandomNumber();

        //ask user to enter a question
        askUserForQuestion();

        //disregard the question and print random response
        System.out.printf("%n%s",printRandom(list,randomIndex));
    }
}
