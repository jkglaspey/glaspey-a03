package baseline;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    //create class Scanner
    private static final Scanner in = new Scanner(System.in);

    //create class Random
    private static final Random random = new Random();

    //create class arrays of letters, numbers and special characters
    private static char[] letters;
    private static final int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static final char[] specialCharacters = new char[0]; //fill array with all special characters

    //create instance variables for password and password length
    private final String password;
    private final int passwordLength;

    //create public constructor to create a password
    public PasswordGenerator(int minimumNumbers, int numbers, int specialCharacters) {
        //ensure the minimumNumbers will consist of at least as many letters as it does numbers + specialCharacters

        //create random password length
        passwordLength = generatePasswordLength(minimumNumbers, numbers, specialCharacters);

        //create random password
        password = generatePassword(passwordLength, numbers, specialCharacters);
    }

    //create default constructor
    public PasswordGenerator() {
        passwordLength = 0;
        password = "";
    }

    //create method that will initialize the class arrays
    public static void initializeClassArrays() {
        //initialize letters
        //initialize numbers
        //initialize special characters
    }

    //create method to ask user for minimum characters
    public static int askUserForMinimumCharacters() {
        //ask user for input
        //return input
        //catch non-numeric value, return 0
    }
    //create method to ask user for number of numbers
    public static int askUserForNumbers() {
        //ask user for input
        //return input
        //catch non-numeric value, return 0
    }
    //create method to ask user for number of special characters
    public static int askUserForSpecialCharacters() {
        //ask user for input
        //return input
        //catch non-numeric value, return 0
    }

    //create method to generate a random length for the password
    //precondition: minimumValue is at least the size of both "minimum" and "2 * (numbers + special characters)" passed
    //  by the user.
    //note: it utilizes a recursive call to increase the size past the minimum length
    //note: the length is determined via the following:
    //  pull a random number which will pass 90% of the time.
    //  If it passes, increment the length and repeat
    //  If it fails, return the current length
    public int generatePasswordLength(int minimumValue, int numOfNumbers, int numOfSpecialCharacters) {
        //generate a random number from 0-9
        //if 0, return minimumValue
        //else increment minimumValue and recursively call generatePasswordLength
    }

    //create method to generate a random password
    //precondition: minimumValue is at least the size of both "minimum" and "2 * (numbers + special characters)" passed
    //  by the user.
    //note: for both the numbers and special characters, it will override a random letter string at random positions for
    //  the amount specified by the user
    public String generatePassword(int minimumValue, int numOfNumbers, int numOfSpecialCharacters) {
        //declare a String
        String password;
        //for "minimumValue" iterations, assign random letters (0-25) to each position in the string

        //create a "used letter" array

        //loop for numOfNumbers
        //generate a random number for index position. If value is in used array, try again
        //generate a random number and replace that position

        //loop for numOfSpecialCharacters
        //generate a random special character for index position. If value is in used array, try again
        //generate a random special character and replace that position

        return password;
    }

    //create a method that prints the password
    //note: this method expects a password to be created, but will not break if the password has not been created.
    public void printPassword() {
        //if password is blank, don't print anything
        //otherwise print password
    }
}
