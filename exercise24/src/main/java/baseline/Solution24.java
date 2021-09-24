/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

public class Solution24 extends Anagram {

    public static void main(String[] args) {

    /*
    Create a program that compares two strings and determines if the two strings are anagrams. The program should prompt
    for both input strings and display the output as shown in the example that follows.
     */

        //declare strings A and B
        String A;
        String B;

        //prompt the user to input data for A
        A = getStringFromUser();
        //prompt the user to input data for B
        B = getStringFromUser();
        //compare if A and B are anagrams
        boolean anagram = isAnagram(A, B);
        //print the results
        printAnagram(anagram, A, B);
    }
}