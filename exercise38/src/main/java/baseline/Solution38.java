/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

import java.util.Scanner;

public class Solution38 {

    //create class Scanner
    private static final Scanner in = new Scanner(System.in);

    //create method to read in string of list of numbers
    public static String getNumbersFromUser() {
        //ask user for ints separated by spaces
        //return next line
    }

    //create method to count the number of spaces in a string, then return the number of items
    public static int countNumOfItems(String s) {
        //create int for total spaces
        int total = 1;
        //loop for string length
        //  if character = space, add 1 to total
        return total;
    }

    //create method to convert a string to an array of Strings
    //this way we can parse each value
    public static String[] convertStringToStringArray(String input) {
        //empty case
        if(input == null) return new String[] {null};
        //create int to store the total items
        //create new string array the size of total items
        //create new string to store each number
        //loop for string length
        //  if character isn't a space, append it to the temp string
        //  if the character is a space, move to the next index and skip space
        //return the string array
    }

    //create method to nullify non-numeric non-even data
    public static int nullifyNonEvenDataAndReturnTotal(String[] list) {
        //create int to represent total cases that were even
        int total = 0;
        //loop for total elements in list
        //  try to parse each element
        //  if it can parse, AND modulus 2 == 0, add 1 to total and move to next value
        //  if not, set value to NULL
        return total;
    }

    //create method to convert an array of strings to an array of even ints
    public static int[] convertStringArrayToEvenIntegerArray(String[] list, int totalEvenNumbers) {
        //fail case
        if(list[0] == null) return new int[0];
        //create new integer array of length totalEvenNumbers
        //create extra index for new array
        //loop for length of old array
        //  if value is even integer, parse and copy to new array and increment extra index
        //  if value is null, skip value and do not increment new index
        //return new list
    }

    //create method to oversee the conversion process
    public static int[] convertStringToEvenIntegerArray(String s) {
        //convert string to array of strings
        //nullify "bad" values in array and return new total
        //convert nullified array to int array
        //return int array
    }

    //create method to print an array
    public static void printArray(int[] list) {
        //print the list of integers
    }

    public static void main(String[] args) {

        //ask user for input and save as a string
        String input = getNumbersFromUser();
        //convert the string to an array of integers
        int[] listOfEvenNumbers = convertStringToEvenIntegerArray(input);
        //print the array
        printArray(listOfEvenNumbers);
    }
}
