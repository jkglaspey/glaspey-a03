/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

public class Solution37 extends PasswordGenerator {

    /*
    Create a program that generates a secure password. Prompt the user for the minimum length, the number of special
    characters, and the number of numbers. Then generate a password for the user using those inputs.
     */

    public static void main(String[] args) {

        //create int to store minimum # of characters
        int minimum = askUserForMinimumCharacters();

        //create int to store # of special characters
        int specialCharacters = askUserForSpecialCharacters();

        //create int to store # of numbers
        int numbers = askUserForNumbers();

        //create a new PasswordGenerator object
        PasswordGenerator password = new PasswordGenerator(minimum,numbers,specialCharacters);
        //print the password
        password.printPassword();
    }
}
