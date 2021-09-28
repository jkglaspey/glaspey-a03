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
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
        this.employeeID = employeeID;
    }

    //create default constructor
    public Input() {
        firstName = "";
        lastName = "";
        zipCode = "";
        employeeID = "";
    }

    //create a method to read the user's first name
    public static String readFirstNameFromUser() {

        //prompt user for first name
        System.out.print("Enter the first name: ");
        return in.nextLine();
    }

    //create a method to read the user's last name
    public static String readLastNameFromUser() {

        //prompt user for first name
        System.out.print("Enter the last name: ");
        return in.nextLine();
    }

    //create a method to read the user's ZIP code
    public static String readZIPCodeFromUser() {

        //prompt user for ZIP code
        System.out.print("Enter the ZIP code: ");
        return in.nextLine();
    }

    //create a method to read the user's employee ID
    public static String readEmployeeIDFromUser() {

        //prompt user for employee ID
        System.out.print("Enter the employee ID: ");
        return in.nextLine();
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
    //returns false if an error was thrown, returns true if no errors were thrown
    public boolean validateFirstName() {

        //check if name is long enough
        if (firstName.length() <= 1) {
            System.out.print("The first name must be at least 2 characters long.\n");

            //check if the name is declared at all
            if(firstName.length() == 0) {
                System.out.print("The first name must be filled in.\n");
            }

            //if the length is 1, the name is invalid
            return false;
        }

        //no errors
        else return true;
    }

    //create method to determine if the last name is filled in and at least 2 characters long
    //returns false if an error was thrown, returns true if no errors were thrown
    public boolean validateLastName() {

        //check if the name is long enough
        if (lastName.length() <= 1) {
            System.out.print("The last name must be at least 2 characters long.\n");

            //check if the name is declared at all
            if(lastName.length() == 0) {
                System.out.print("The first name must be filled in.\n");
            }

            //if the length is 1, the name is invalid
            return false;
        }

        //no errors
        else return true;
    }

    //create method to determine if the employee id is in the format AA-1234
    //returns false if an error was thrown, returns true if no errors were thrown
    public boolean validateEmployeeID() {

        //keep track of errors
        boolean pass = employeeID.length() == 7;

        //check that first 2 characters are letters
        if(pass) {
            for (int i = 0; i < 2; i++) {

                //the character is not a letter
                if (!Character.isLetter(employeeID.charAt(i))) {
                    pass = false;
                    break;
                }
            }
        }

        //check that the 3rd character is a hyphen
        if(pass && employeeID.charAt(2) != '-') {
            pass = false;
        }

        //check that the last 4 characters are numeric
        if(pass) {
            for(int i = 3; i < 7; i++) {

                //the character is not numeric
                if(!Character.isDigit(employeeID.charAt(i))) {
                    pass = false;
                    break;
                }
            }
        }
        //return the validity of the ID
        if(!pass) System.out.print("The employee ID must be in the format of AA-1234.\n");
        return pass;
    }

    //create method to determine if the ZIP code is a 5-digit number
    //returns false if an error was thrown, returns true if no errors were thrown
    public boolean validateZIPCode() {

        //validate that the length is 5 characters
        if(zipCode.length() == 5) {

            //validate that all 5 characters are numbers
            for(int i = 0; i <= 5; i++) {

                //the zip code is valid
                if(i == 5) return true;

                //create temp value
                char temp = zipCode.charAt(i);

                //the character is not numeric
                if(!(temp >= 48 && temp <= 57)) {
                    break;
                }
            }
        }
        System.out.print("The ZIP code must be a 5 digit number.\n");
        return false;
    }

    //create method to take in all input data and invoke the specific validation functions
    //note: if all functions pass, this will print that no errors were found
    public static void validateInput(String firstName, String lastName, String zipCode, String employeeID) {

        //create an input object
        Input input = new Input(firstName,lastName,zipCode,employeeID);

        //run the validation functions and store the results
        boolean firstNameValidity = input.validateFirstName();
        boolean lastNameValidity = input.validateLastName();
        boolean employeeIDValidity = input.validateEmployeeID();
        boolean zipCodeValidity = input.validateZIPCode();

        //if all four functions passed with no errors, prompt the user
        if(firstNameValidity && lastNameValidity && employeeIDValidity && zipCodeValidity) {
            System.out.print("There were no errors found.\n");
        }
    }
}
