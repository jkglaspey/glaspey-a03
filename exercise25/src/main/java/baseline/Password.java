package baseline;

import java.util.Scanner;

public class Password {

    //create instance variables for password, length, and strength
    private final char[] string;
    private final int length;
    private int strength;

    //create instance variable ONLY for final print
    private final String printValue;

    //create class Scanner
    private static final Scanner in = new Scanner(System.in);

    //create constructor that takes in password and length
    public Password(String string) {
        this.string = toCharArray(string);
        length = this.string.length;
        strength = 0;
        printValue = string;
    }

    //create default constructor to avoid error
    public Password() {
        string = new char[0];
        length = 0;
        strength = 0;
        printValue = "";
    }

    //create method to read user input
    public static String initialPrompt() {
        System.out.print("Enter a password: ");

        //return the password
        return in.nextLine();
    }

    //create method that returns the password
    public char[] getPassword() {
        return string;
    }

    //create method that returns the password length
    public int getLength() {
        return length;
    }

    //create method that returns the password strength
    public int getStrength() {
        return strength;
    }

    //create method that sets the password strength
    private void setStrength(int i) {
        strength = i;
    }

    //create method that converts the password to an array of characters
    public static char[] toCharArray(String s) {

        //create a char array
        char[] passwordArray = new char[s.length()];

        //iterates a loop
        for(int i = 0; i < s.length(); i++) {
            passwordArray[i] = s.charAt(i);
        }

        //for the length of the array, convert the next character to char and assign to the password array
        return passwordArray;
    }

    //create method to determine if there are letters in the array
    public boolean isLettersInPassword() {
        //loop through password array
        //if there is an ASCII value of a letter, return true
        for(char c : string) {
            if(((c >= 65) && (c <= 90)) || ((c >= 97) && (c <= 122))) return true;
        }

        //else return false
        return false;
    }

    //create method to determine if there are numbers in the array
    public boolean isNumbersInPassword() {
        //loop through password array
        //if there is an ASCII value of a number, return true
        for(char c : string) {
            if( (c >= 48) && (c <= 57) ) return true;
        }

        //else return false
        return false;
    }

    //create method to determine if there are special characters in the array
    public boolean isSpecialCharactersInPassword() {
        //loop through password array
        //if there is an ASCII value of a special character, return true
        for(char c : string) {
            if(!((c >= 48) && (c <= 57)) && !((c >= 65) && (c <= 90)) && !((c >= 97) && (c <= 122))) return true;
        }

        //else return false
        return false;
    }

    //create method to determine the strength of the password and return an int value for how strong it is
    public static void passwordValidator(Password password) {
        //if length < 8 && only letters, set strength to 2
        if((password.getLength() < 8)  && !(password.isSpecialCharactersInPassword()) ) {
            if(!(password.isNumbersInPassword())) password.setStrength(2);

            //if length < 8 && only numbers, set strength to 1
            else if(!(password.isLettersInPassword())) password.setStrength(1);
        }

        //if length >= 8 && contains letters, numbers, and special characters, return 4
        else if((password.getLength() >= 8)  && (password.isNumbersInPassword()) ) {
            if(password.isSpecialCharactersInPassword()) password.setStrength(4);

            //if length >= 8 && contains letters and a number, set strength to 3
            else password.setStrength(3);
        }

        //else set strength to 0
        else password.setStrength(0);
    }

    //create method to print results based on int
    public void printStrength() {
        //create string for allowing single output statement
        String result;

        //if strength = 0, print "unknown strength"
        if(strength == 0) result = "of unknown strength.";
        //if strength = 1, print "very weak strength"
        else if(strength == 1) result = "a very weak password.";
        //if strength = 2, print "weak strength"
        else if(strength == 2) result = "a weak password.";
        //if strength = 3, print "strong strength"
        else if(strength == 3) result = "a strong password.";
        //if strength = 4, print "very strong strength"
        else result = "a very strong password.";

        //print result
        System.out.printf("The password '%s' is %s",printValue,result);
    }
}