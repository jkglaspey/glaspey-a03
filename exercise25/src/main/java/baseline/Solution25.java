/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

public class Solution25 {
    public static void main(String[] args) {
        /*
        Create a program that determines the complexity of a given password based on these rules:
            * A very weak password contains only numbers and is fewer than eight characters.
            * A weak password contains only letters and is fewer than eight characters.
            * A strong password contains letters and at least one number and is at least eight characters.
            * A very strong password contains letters, numbers, and special characters and is at least eight characters.
         */

        //ask user to input password for Password

        //create Password object (converts string to char array, and finds length)
        Password password = new Password(in.nextLine());

        //calculate the strength of the password
        password.determinePasswordStrength();

        //print out the strength of the password
        password.printStrength();
    }
}
