/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

    //create a class Scanner
    private static final Scanner in = new Scanner(System.in);

    //create a class Random
    private static final Random random = new Random();

    //create instance variables for the difficulty, random number, and total guesses
    private final int difficulty;
    private final int number;
    private int guesses;

    //create constructor
    public RandomNumber(int difficulty) {
        this.difficulty = difficulty;
        this.guesses = 0;

        //generate random number based on difficulty
        this.number = random.nextInt((int) Math.pow(10,difficulty)) + 1;

        //add prompt to tell user to enter the first guess
        System.out.print("I have my number. What's your guess? ");
    }

    //create default constructor
    public RandomNumber() {
        this.difficulty = 1;
        this.number = random.nextInt(10) + 1;
        this.guesses = 0;
    }

    //create method to get the difficulty
    public int getDifficulty() { return difficulty; }

    //create method to get the number
    public int getNumber() { return number; }

    //create method to get the total guesses
    public int getGuesses() { return guesses; }

    //create method to prompt the introduction to the game
    public static void sayIntroduction() {
        System.out.print("Let's play Guess the Number!\n");
    }

    //create method to ask the user for difficulty level
    public static int askUserForDifficulty() {

        //create integer to store input
        int difficulty = -1;
        //loop until user enters numeric data
        do{
            //user input was invalid
            if(difficulty == 0) System.out.print("Please enter a valid difficulty");

            //try to get valid user input
            try{
                System.out.print("\nEnter the difficulty level (1, 2, or 3): ");
                difficulty = in.nextInt();

                //input is outside the range of acceptable values
                if((difficulty < 1) || (difficulty > 3)) difficulty = 0;
            }
            //catch non-numeric data
            catch(InputMismatchException e) {

                //clear input lag
                in.nextLine();

                //user input was invalid
                difficulty = 0;
            }
        } while(difficulty == 0);

        //user input is valid
        return difficulty;
    }

    //create method to oversee the guessing logic
    public void guessNumber() {

        //create int to represent the user guess
        int guess;
        //loop until user guesses right
        do{

            //increment total guesses
            guesses++;

            //if it's too low, add to total guesses and print that it's too low and to guess again
            //if it's too high, add to total guesses and print that it's too high and to guess again
            //if it's right, break the loop
            try{

                //read user input
                guess = in.nextInt();

                //the input is lower than the actual number
                if(guess < number) {
                    System.out.print("Too low. Guess again: ");
                    guess = 0;
                }

                //the input is higher than the actual number
                else if(guess > number) {
                    System.out.print("Too high. Guess again: ");
                    guess = 0;
                }
            }

            //catch non-numeric input
            catch(InputMismatchException e) {

                //clear input lag
                in.nextLine();

                System.out.print("Not a valid number. Guess again: ");
                guess = 0;
            }
        } while (guess == 0);
    }

    //create method to prompt user if they wish to play again
    public boolean askUserToPlayAgain() {

        //clear input lag
        in.nextLine();

        //print total guesses
        System.out.printf("You got it in %d guesses!%n%n",guesses);

        //prompt user to enter "Y" or "N" to play again
        System.out.print("Do you wish to play again (Y / N)? ");

        //if "Y", return true
        //if "N" (or anything else), return false
        return in.nextLine().equalsIgnoreCase("Y");
    }
}
