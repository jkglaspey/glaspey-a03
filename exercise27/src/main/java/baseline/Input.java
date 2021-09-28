package baseline;

import java.util.Scanner;

public class Input {

    //create class Scanner for user input
    private static final Scanner in = new Scanner(System.in);

    //create instance variables for user input
    private final String firstName;
    private final String lastName;
    private final String zipCode;
    private final String employeeID;

    //create public constructor to store first name, last name, ZIP code, and employee ID
    public Input(String firstName, String lastName, String zipCode, String employeeID) {
        //initialize the input values
    }

    //create a method to read the user's first name
    public static String readFirstNameFromUser() {

        //prompt user for first name
        //return next line
    }

    //create a method to read the user's last name
    public static String readLastNameFromUser() {

        //prompt user for first name
        //return next line
    }

    //create a method to read the user's ZIP code
    public static String readZIPCodeFromUser() {

        //prompt user for ZIP code
        //return next line
    }

    //create a method to read the user's employee ID
    public static String readEmployeeIDFromUser() {

        //prompt user for employee ID
        //return next line
    }

    //create a method to return the user's first name
    public String getFirstName() { return firstName; }

    //create a method to return the user's last name
    public String getLastName() { return lastName; }

    //create a method to return the user's ZIP code
    public String getZIPCode() { return zipCode; }

    //create a method to return the user's employee id
    public String getEmployeeID() { return employeeID; }

    //create method to determine if the first name is filled in and at least 2 characters long
    //returns 0 if an error was thrown, returns a 1 if no errors were thrown
    public int validateFirstName() {
        //if charAt(1) == NULL
        //  print "The first name must be at least 2 characters long."
        //  if charAt(0) == NULL
        //      print "The first name must be filled in."
        //  return 0
        //else return 1
    }

    //create method to determine if the last name is filled in and at least 2 characters long
    //returns 0 if an error was thrown, returns a 1 if no errors were thrown
    public int validateLastName() {
        //if charAt(0) == NULL, OR charAt(1) == NULL
        //  print "The last name must be at least 2 characters long."
        //  if charAt(0) == NULL
        //      print "The last name must be filled in."
        //  return 0
        //else return 1
    }

    //create method to determine if the employee id is in the format AA-1234
    //returns 0 if an error was thrown, returns a 1 if no errors were thrown
    public int validateEmployeeID() {
        //if string length == 7
        //  loop 7 times
        //      for the first 2 iterations, if the characters are letters, continue
        //      for the 3rd iteration, if the character is '-', continue
        //      for the last 4 iterations, if the character is numeric, continue
        //      if all passes, return 1
        //else
        //  print "The employee ID must be in the format of AA-1234."
        //  return 0
    }

    //create method to determine if the ZIP code is a 5-digit number
    //returns 0 if an error was thrown, returns a 1 if no errors were thrown
    public int validateZIPCode() {
        //if string length == 5
        //  loop 5 times:
        //      if each character is numeric, return 1
        //else
        //  print "The ZIP code must be a 5 digit number."
        //  return 0
    }

    //create method to take in all of the input data and invoke the specific validation functions
    //note: if all functions pass, this will print that no errors were found
    public void validateInput(String firstName, String lastName, String zipCode, String employeeID) {

        //create an input object
        //run all four validation functions as one boolean command, where:
        //if (all four inputs are valid) print "There were no errors found."
    }
}
