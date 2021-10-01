/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution36 {

    /*
    Write a program that prompts for response times from a website in milliseconds. It should keep asking for values
    until the user enters “done.”
     */

    //create a class Scanner
    private static final Scanner in = new Scanner(System.in);

    //create a method to initialize a new ArrayList
    public static List<Integer> initList() {
        //create new ArrayList
    }

    //create a method to determine if the list is empty
    public static boolean isEmpty(List<Integer> list) {
        //if it's empty, return true
    }

    //create a method to add an int to an ArrayList
    public static void addNumberToList(List<Integer> list, int x) {
        //add x to the end of list
    }

    //create a method to verify that a String is numeric
    public static boolean isNumeric(List<Integer> list, String s) {
        //if the string is numeric:
        //  add s to list
        //  return true
        //else return false (will be dealt with in main)
    }

    //create a method to prompt the user for an int (and return as a String)
    public static String getNumberFromUser() {
        //ask user for input
        //return next line
    }

    //create a method to print the ArrayList of numbers
    public static void printList(List<Integer> list) {
        //if list is empty, don't print anything
        //loop for list.size()
        //print list at index i
    }

    //create a method to calculate the total
    public static int total(List<Integer> list) {
        //if the list is empty, return 0
        //create int to store total
        int total = 0;
        //loop through list and add all values to total

        return total;
    }

    //create a method to calculate average
    public static double average(List<Integer> list) {
        //if the list is empty, return 0
        //create int to store average
        int average = 0;
        //calculate the total with total(list) and add to average
        //divide average by list.size()

        return average;
    }

    //create a method to calculate the max
    public static int max(List<Integer> list) {
        //if the list is empty, return 0
        //create int at lowest possible integer value
        int max = Integer.MIN_VALUE;
        //loop through list:
        //  if current value is greater than max, set max to current value

        return max;
    }

    //create a method to calculate the min
    public static int min(List<Integer> list) {
        //if the list is empty, return 0
        //create int at lowest possible integer value
        int min = Integer.MAX_VALUE;
        //loop through list:
        //  if current value is lower than min, set min to current value

        return min;
    }

    //create a method to calculate the standard deviation
    public static double std(List<Integer> list) {
        //if the list is empty, return 0
        //create int to store the standard deviation
        int std = 0;
        //create int to store the mean using average(list)
        //add the square of the difference between each number and the average to std
        //take the square root of std / list.size()

        return std;
    }

    //create method to print either the maximum or the minimum
    //note: this method is overloaded
    public static void printValue(String s, int x) {
        //print that the "maximum / minimum" is "x"
    }

    //create method to print the either average or standard deviation
    //note: this method is overloaded
    public static void printValue(String s, double x) {
        //if s is average
        //  print that the average is x (to one decimal)
        //if s is std
        //  print that the standard deviation is x (to three decimals)
    }

    //create method to print all statistics
    public static void printStatistics(double average, int max, int min, double std) {
        //print the average
        printValue("average",average);
        //print the max
        printValue("minimum",min);
        //print the min
        printValue("maximum",max);
        //print the std
        printValue("standard deviation",std);
    }

    public static void main(String[] args) {

        //create a new list
        List<Integer> list = initList();

        //loop to add numbers to the list
        //store user input and terminate when the user enters "done"
        //verify the validity of each input

        //print the list
        //get the average of the list
        //get the maximum of the list
        //get the minimum of the list
        //get the standard deviation of the list
        //print the results
    }
}
