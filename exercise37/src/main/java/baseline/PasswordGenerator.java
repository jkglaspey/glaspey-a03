/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    //create class Scanner
    private static final Scanner in = new Scanner(System.in);

    //create class Random
    private static final Random random = new Random();

    //create class "fail" String
    private static final String NOT_VALID_INPUT = "That's not a valid input. Please try again.\n";

    //create arrays of letters, numbers and special characters
    //note: they are private despite being not unique to this class because they are only initialized on certain
    //  instances.
    private static char[] letters;
    private static char[] numbers;
    private static char[] specialCharacters;

    //create instance variables for password and password length
    private final String password;
    private final int passwordLength;

    //create public constructor to create a password
    public PasswordGenerator(int minimumValues, int numOfNumbers, int numOfSpecialCharacters) {
        //verify the minimumNumbers will consist of at least as many letters as it has numbers and special characters
        if(minimumValues < 2 * (numOfNumbers + numOfSpecialCharacters))
            minimumValues = 2 * (numOfNumbers + numOfSpecialCharacters);

        //create random password length
        this.passwordLength = generatePasswordLength(minimumValues);

        //initialize necessary class character lists
        if(passwordLength > 0) initializeLettersList();
        if(numOfNumbers > 0) initializeNumbersList();
        if(numOfSpecialCharacters > 0) initializeSpecialCharactersList();

        //create random password
        this.password = generatePassword(passwordLength, numOfNumbers, numOfSpecialCharacters);
    }

    //create default constructor
    public PasswordGenerator() {
        passwordLength = 0;
        password = "";
    }

    //create method that will return a specific class list
    //note: this is for JUnit testing purposes
    public static char[] getClassList(String s) {
        if(s.equals("letters")) return letters;
        if(s.equals("numbers")) return numbers;
        if(s.equals("special characters")) return specialCharacters;
        else return new char[0];
    }

    //create method that will assign all possible letters in a class array
    public static void initializeLettersList() {

        //--- initialize letters ---
        letters = new char[52];

        //lowercase letters
        for (int i = 0; i < 26; i++) {
            letters[i] = (char) (i + 97);
        }

        //uppercase letters
        for (int i = 0; i < 26; i++) {
            letters[i + 26] = (char) (i + 65);
        }
    }

    //create method that will assign all possible numbers in a class array
    public static void initializeNumbersList() {
        //--- initialize numbers ---
        //note: this is a char array because the numbers will be converted once the password is created
        numbers = new char[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = (char)(i + 48);
        }
    }

    //create method that will assign all possible special characters in a class array
    public static void initializeSpecialCharactersList() {
        //--- initialize special characters ---
        //note: this list contains all special characters included on the standard US keyboard except for 'space'
        //note: the total is 32
        specialCharacters = new char[]
                {33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 64,
                        91, 92, 93, 94, 95, 96, 123, 124, 125, 126};
    }

    //create method to get the password length
    public int getPasswordLength() { return passwordLength; }

    //create method to get the password
    public String getPassword() { return password; }

    //create method to ask user for minimum characters
    public static int askUserForMinimumCharacters() {
        //loop to ensure the input is numerical
        do{
            try{
                //ask user for input
                System.out.print("What's the minimum length? ");

                //return input as long as it's non-negative
                int input = in.nextInt();
                if(input >= 0) return input;

                //negative number
                else System.out.printf("%s", NOT_VALID_INPUT);
            }
            //catch non-numeric value, return 0
            catch(InputMismatchException ex) {
                //clean terminal
                in.nextLine();

                System.out.printf("%s", NOT_VALID_INPUT);
            }
        } while(true);
    }

    //create method to ask user for number of special characters
    public static int askUserForSpecialCharacters() {
        //loop to ensure the input is numerical
        do{
            try{
                //ask user for input
                System.out.print("How many special characters? ");

                //return input as long as it's non-negative
                int input = in.nextInt();
                if(input >= 0) return input;

                //negative number
                else System.out.printf("%s", NOT_VALID_INPUT);
            }
            //catch non-numeric value, return 0
            catch(InputMismatchException ex) {
                //clean terminal
                in.nextLine();

                System.out.printf("%s", NOT_VALID_INPUT);
            }
        } while(true);
    }

    //create method to ask user for number of numbers
    public static int askUserForNumbers() {
        //loop to ensure the input is numerical
        do{
            try{
                //ask user for input
                System.out.print("How many numbers? ");

                //return input as long as it's non-negative
                int input = in.nextInt();
                if(input >= 0) return input;

                //negative number
                else System.out.printf("%s", NOT_VALID_INPUT);
            }
            //catch non-numeric value, return 0
            catch(InputMismatchException ex) {
                //clean terminal
                in.nextLine();

                System.out.printf("%s", NOT_VALID_INPUT);
            }
        } while(true);
    }

    //create method to generate a random length for the password
    //precondition: minimumValue is at least the size of both "minimum" and "2 * (numbers + special characters)" passed
    //  by the user.
    //note: it utilizes a recursive call to increase the size past the minimum length
    //note: the length is determined via the following:
    //  pull a random number which will pass 90% of the time.
    //  If it passes, increment the length and repeat
    //  If it fails, return the current length
    public static int generatePasswordLength(int minimumValue) {
        //generate a random number from 0-9
        int x = random.nextInt(10);
        //if not 0, increment minimumValue and recursively call generatePasswordLength
        if(x != 0) minimumValue = generatePasswordLength(minimumValue + 1);

        //otherwise, return the randomly incremented size
        return minimumValue;
    }

    //create method to generate a random password
    //precondition: minimumValue is at least the size of both "minimum" and "2 * (numbers + special characters)" passed
    //  by the user.
    //note: for both the numbers and special characters, it will override a random letter string at random positions for
    //  the amount specified by the user
    public static String generatePassword(int length, int numOfNumbers, int numOfSpecialCharacters) {
        //empty case
        if(length == 0) return "";

        //declare a String
        char[] passwordArray = new char[length];

        //generate random password of only letters
        for(int i = 0; i < length; i++) {
            passwordArray[i] = letters[random.nextInt(52)];
        }

        //create a "used letter" array
        //note: this array is a char array because char takes up less memory than int
        char[] used = new char[length];

        //create variables for random index in password and random index in class lists
        int indexPassword;
        int indexList;

        //add numbers to the password
        for(int i = 0; i < numOfNumbers; i++) {
            //generate a random number for index position. If value is in used array, try again
            do{
                indexPassword = random.nextInt(length);
            } while(used[indexPassword] != 0);

            //generate a random index in the numbers list
            indexList = random.nextInt(10);

            //override the value in the password with random number
            passwordArray[indexPassword] = numbers[indexList];

            //declare that the position was changed in used array
            used[indexPassword] = 1;
        }

        //add special characters to the password
        for(int i = 0; i < numOfSpecialCharacters; i++) {
            //generate a random number for index position. If value is in used array, try again
            do{
                indexPassword = random.nextInt(length);
            } while(used[indexPassword] != 0);

            //generate a random index in the special characters list
            indexList = random.nextInt(32);

            //override the value in the password with random special character
            passwordArray[indexPassword] = specialCharacters[indexList];

            //declare that the position was changed in used array
            used[indexPassword] = 1;
        }

        //convert password array to string
        return String.valueOf(passwordArray);
    }

    //create a method that prints the password
    //note: this method expects a password to be created, but will not break if the password has not been created.
    public void printPassword() {
        //if password is blank, don't print anything
        if(password.equals("")) System.out.print("There is no password...");

        //otherwise, print password
        System.out.printf("Your password is %s ",password);
    }
}
