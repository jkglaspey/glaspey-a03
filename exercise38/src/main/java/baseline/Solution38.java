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
        System.out.print("Enter a list of numbers, separated by spaces: ");

        return in.nextLine();
    }

    //create method to find the index of the first non-space in a string
    //note: it should ideally be indexed at 0
    //note: if the string is only spaces, return the length of the array
    public static int findFirstNonSpace(String s) {
        //loop through the array to find a non-space
        int i = 0;
        while(i != s.length()) {
            //found a non-space
            if(s.charAt(i) != ' ') break;
            else i++;
        }
        //can be 0 - s.length().
        return i;
    }

    //create method to count the number of spaces in a string, then return the number of items
    public static int countNumOfItems(String s) {
        //empty case 1 (null)
        if(s == null) return 0;

        //empty case 2 (new line)
        if(s.equals("")) return 0;

        //create int for total spaces
        int total = 1;

        //find first character in array
        int i = findFirstNonSpace(s);

        //empty case 3 (only spaces)
        if(i == s.length()) return 0;

        //check that there is a valid next character (in case the user ended the string with a space).
        for(; i < s.length(); i++) {
            if((s.charAt(i) == ' ') && (i != s.length() - 1)) total++;
        }

        return total;
    }

    //create method to convert a string to an array of Strings
    //this way we can parse each value
    //note: empty cases return empty arrays
    public static String[] convertStringToStringArray(String input) {
        //empty case 1 (null)
        if(input == null) return new String[0];

        //create int to store the total items
        int totalItems = countNumOfItems(input);

        //empty case 2 (no items)
        if(totalItems == 0) return new String[0];

        //create new string array the size of total items.
        String[] newList = new String[totalItems];

        //create new string to store each number
        StringBuilder temp = new StringBuilder();

        //find index of the first non-space character
        int i = findFirstNonSpace(input); //index for old array

        //create indexes
        int j = 0; //new array

        for(; i < input.length(); i++) {
            //if the character is a space, move to the next index and skip space
            if(input.charAt(i) == ' ') {
                newList[j] = temp.toString();

                //reset the temp value
                temp.setLength(0);

                //move to next open index in new array
                j++;
            }
            //if the character isn't a space, append it to the temp string
            else {
                temp.append(input.charAt(i));
            }
        }

        //test that the last value was stored
        if(!(temp.toString().equals(""))) newList[j] = temp.toString();

        return newList;
    }

    //create method to nullify non-numeric non-even data
    //note: it returns the number of even numbers in list, but internally converts "bad" values to null
    public static int nullifyNonEvenDataAndReturnTotal(String[] list) {
        //empty case
        if(list.length == 0) return 0;

        //create int to represent total cases that were even
        int total = 0;

        //create temp value
        int temp;

        //try to parse each element
        for(int i = 0; i < list.length; i++) {
            try{
                //attempt to parse string to int
                temp = Integer.parseInt(list[i]);

                //if the string value is a numeric, but ODD, still fails
                if(temp % 2 == 1) list[i] = null;

                //if it can parse, AND even, add 1 to total and move to next value
                else total++;
            }
            //element isn't numeric
            catch(NumberFormatException e) {
                list[i] = null;
            }
        }

        return total;
    }

    //create method to convert an array of strings to an array of even ints
    //precondition: totalEvenNumbers > 0 and list has been nullified
    //note: empty cases are returned as empty arrays
    public static int[] filterEvenNumbers(String[] list, int totalEvenNumbers) {
        //create new integer array of length totalEvenNumbers
        int[] newList = new int[totalEvenNumbers];

        //create index values
        int i; //list
        int j = 0; //new list

        for(i = 0; i < list.length; i++) {
            //if value is even integer, parse and copy to new array and increment extra index
            if(list[i] != null) {
                newList[j] = Integer.parseInt(list[i]);
                j++;
            }
            //if value is null, skip value and do not increment new index
        }

        return newList;
    }

    //create method to oversee the conversion process
    public static int[] convertStringToEvenIntegerArray(String s) {
        //convert string to array of strings
        String[] stringArray = convertStringToStringArray(s);

        //nullify "bad" values in array and return new total
        int totalEvenNumbers = nullifyNonEvenDataAndReturnTotal(stringArray);

        //if no even numbers, return empty int array
        if(totalEvenNumbers == 0) return new int[0];

        //convert nullified array to int array (and return it)
        return filterEvenNumbers(stringArray,totalEvenNumbers);
    }

    //create method to print an array of even numbers
    public static void printEvenArray(int[] list) {
        System.out.print("The even numbers are");

        for (int j : list) {
            System.out.printf(" %d", j);
        }
        System.out.print(".");
    }

    public static void main(String[] args) {

        //ask user for input and save as a string
        String input = getNumbersFromUser();
        //convert the string to an array of integers
        int[] listOfEvenNumbers = convertStringToEvenIntegerArray(input);
        //print the array
        printEvenArray(listOfEvenNumbers);
    }
}
