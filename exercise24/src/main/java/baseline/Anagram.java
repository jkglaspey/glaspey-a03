package baseline;

import java.util.Scanner;

public abstract class Anagram {

    //declare class Scanner variable
    Scanner in = new Scanner(System.in);
    //declare static int i for counting total strings
    private static int i = 1;

    //create method to read input
    public static String getStringFromUser() {
        //declare String
        String input = null;
        //prompt for user to enter String #i, where i is a class variable for total iterations
        return input;
    }

    //create method to compare if Strings are anagrams
    public static boolean isAnagram(String a, String b) {

        //2 conditions: are the strings the same length AND do the strings contain the exact same characters?
        //Condition 1: check sting lengths. Return false if fails
        //Condition 2: check if the strings contain the exact same characters
        //create 2 character frequency arrays
        //loop and count the total occurrances of each letter from each string
        //compare the two frequency arrays
        //if the arrays are not equal, return false
        return true;
    }

    //create method to print results
    public static void printAnagram(boolean anagram, String A, String B) {
        //if boolean value is true, print that A and B are anagrams
        //else print that A and B are not anagrams
    }
}
