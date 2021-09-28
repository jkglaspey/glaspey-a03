/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

public class Solution27 {

    public static void main(String[] args) {

        /*
        Write a program that prompts for a first name, last name, employee ID, and ZIP code. Ensure that the input is
        valid according to these rules:
            - The first name must be filled in.
            - The last name must be filled in.
            - The first and last names must be at least two characters long.
            - An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
            - The ZIP code must be a number.
         */

        //call a function that returns the user's first name
        String firstName = readFirstNameFromUser();
        //call a function that returns the user's last name
        String lastName = readLastNameFromUser();
        //call a function that returns the user's ZIP code
        String zipCode = readZIPCodeFromUser();
        //call a function that returns the user's Employee ID
        String employeeID = readEmployeeIDFromUser();
        //call method validateInput to determine errors with the user's inputs
        input.validateInput(firstName,lastName,zipCode,employeeID);
    }
}
