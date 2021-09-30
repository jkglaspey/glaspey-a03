/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

    //create a class Scanner
    private static final Scanner in = new Scanner(System.in);

    //create instance variables for the difficulty, random number, and total guesses
    private int difficulty;
    private int number;
    private int guesses;

    //create constructor
    public RandomNumber(int difficulty) {
        //initialize values
        //generate random number based on difficulty
        //add prompt to tell user to enter the first guess
    }

    //create method to get the difficulty
    public int getDifficulty() { return difficulty; }

    //create method to get the number
    public int getNumber() { return number; }

    //create method to get the total guesses
    public int getGuesses() { return guesses; }

    //create method to ask the user for difficulty level
    public int askUserForDifficulty() {
        //loop until user enters numeric data
        //try to ask user for difficulty (1-3)
        //if difficulty is outside (1-3), force user to ask again
        //catch non-numeric data and force user to ask again
        //otherwise return difficulty
    }

    //create method to oversee the guessing logic
    public void guessNumber() {
        //create int to represent the user guess
        //loop until user guesses right
        //read user input
        //if it's too low, add to total guesses and print that it's too low and to guess again
        //if it's too high, add to total guesses and print that it's too high and to guess again
        //if it's right, break the loop
        //catch non-numeric data, add to total guesses, and force the user to guess again
    }

    //create method to prompt user if they wish to play again
    public boolean askUserToPlayAgain() {

        //print total guesses
        //prompt user to enter "Y" or "N" to play again
        //if "Y", return true
        //if "N", return false
    }
}
