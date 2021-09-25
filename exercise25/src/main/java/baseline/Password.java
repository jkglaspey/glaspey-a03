package baseline;

public class Password {

    //create instance variables for password, length, and strength
    private char[] password;
    private int length;
    private int strength;

    //create constructor that takes in password and length
    private Password(String password) {
        this.password = toCharArray(password);
        this.length = this.password.length;
        this.strength = 0;
    }

    //create method that returns the password
    private char[] getPassword() {
        return password;
    }

    //create method that returns the password length
    private int getLength() {
        return length;
    }

    //private method that returns the password strength
    private int getStrength();

    //create method that converts the password to an array of characters
    private static char[] toCharArray(String s) {
        //iterates a loop
        //for the length of the array, convert the next character to a char and assign to the password array
        return password;
    }

    //create method to determine if there are numbers in the array
    private boolean isNumbersInPassword() {
        //loop through password array
        //if there is an ASCII value of a number, return true
        //else return false
        return false;
    }

    //create method to determine if there are special characters in the array
    private boolean isSpecialCharactersInPassword() {
        //loop through password array
        //if there is an ASCII value of a special character, return true
        //else return false
        return false;
    }

    //create method to determine the strength of the password and return an int value for how strong it is
    private void determinePasswordStrength() {
        //if length < 8 && only numbers, set strength to 1
        //if length < 8 && only letters, set strength to 2
        //if length >= 8 && contains letters and a number, set strength to 3
        //if length >= 8 && contains letters, numbers, and special characters, return 4
        //else set strength to 0
    }

    //create method to print results based on int
    private void printStrength() {
        //if strength = 0, print "unknown strength"
        //if strength = 1, print "very weak strength"
        //if strength = 2, print "weak strength"
        //if strength = 3, print "strong strength"
        //if strength = 4, print "very strong strength"
    }

}