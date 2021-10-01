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
    until the user enters "done."
     */

    //create a class Scanner
    private static final Scanner in = new Scanner(System.in);

    //create a method to initialize a new ArrayList
    public static List<Integer> initList() {
        return new ArrayList<>();
    }

    //create a method to determine if the list is empty
    //note: change to public for unit testing
    private static boolean isEmpty(List<Integer> list) {
        return list.isEmpty();
    }

    //create a method to add an int to an ArrayList
    //note: change to public for unit testing
    private static void addNumberToList(List<Integer> list, int x) {
        list.add(x);
    }

    //create a method to add a number to the list ONLY if it is numeric
    public static void addNumberOnly(List<Integer> list, String s) {
        //verify the string is numeric, then add it to the list
        try{
            int x = Integer.parseInt(s);
            addNumberToList(list,x);
        }
        //value wasn't numeric
        catch(NumberFormatException e) {
            //value isn't "done"
            if(!(s.equalsIgnoreCase("done"))) System.out.print("Please enter a valid response!\n");
        }
    }

    //create a method to prompt the user for an int (and return as a String)
    public static String getNumberFromUser() {
        //ask user for input
        System.out.print("Enter a number: ");

        //return next line
        return in.nextLine();
    }

    //create a method to print the ArrayList of numbers
    public static void printList(List<Integer> list) {
        //print initial prompt
        System.out.print("Numbers: ");

        //if list is empty, don't print anything
        if(!isEmpty(list)) {
            //loop for each value (must have an index)
            for(int i = 0; i < list.size(); i++) {
                System.out.printf("%d",list.get(i));

                //add commas between numbers
                if(i != list.size() - 1) System.out.print(", ");
            }
        }
    }

    //create a method to calculate the total
    //note: can be private, but since total is a useful method I left it public
    public static int total(List<Integer> list) {
        //if the list is empty, return 0
        if(isEmpty(list)) return 0;

        //create int to store total
        int total = 0;

        //loop through list and add all values to total
        for(int x : list) {
            total += x;
        }

        return total;
    }

    //create a method to calculate average
    public static double average(List<Integer> list) {
        //if the list is empty, return 0
        if(isEmpty(list)) return 0;

        //create int to store average
        int average = total(list);

        //divide average by list.size()
        average /= list.size();

        return average;
    }

    //create a method to calculate the max
    public static int max(List<Integer> list) {
        //if the list is empty, return 0
        if(isEmpty(list)) return 0;

        //create int at lowest possible integer value
        int max = Integer.MIN_VALUE;

        //loop through list:
        //  if current value is greater than max, set max to current value
        for(int x: list) {
            if(max < x) max = x;
        }

        return max;
    }

    //create a method to calculate the min
    public static int min(List<Integer> list) {
        //if the list is empty, return 0
        if(isEmpty(list)) return 0;

        //create int at lowest possible integer value
        int min = Integer.MAX_VALUE;

        //loop through list:
        //  if current value is lower than min, set min to current value
        for(int x: list) {
            if(min > x) min = x;
        }

        return min;
    }

    //create a method to calculate the standard deviation
    //note: standard deviation is calculated using the population formula
    public static double std(List<Integer> list) {
        //if the list is empty, return 0
        if(isEmpty(list)) return 0;

        //create int to store the standard deviation
        double std = 0;

        //create int to store the mean using average(list)
        double average = average(list);

        //add the square of the difference between each number and the average to std
        for(int x: list) {
            std += Math.pow(x - average,2);
        }

        //take the square root of std / list.size()
        return Math.sqrt(std / list.size());
    }

    //create method to print either the maximum or the minimum
    //note: this method is overloaded
    //precondition: s can only be either "minimum" or "maximum"
    public static void printValue(String s, int x) {
        System.out.printf("%nThe %s is %d",s,x);
    }

    //create method to print either the average or standard deviation
    //note: this method is overloaded
    //precondition: s can only be either "average" or "standard deviation"
    public static void printValue(String s, double x) {
        //average
        if(s.equals("average")) System.out.printf("%nThe average is %.1f",x);

        //standard deviation
        if(s.equals("standard deviation")) System.out.printf("%nThe standard deviation is %.2f",x);
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

        //add numbers to the list
        String terminate;
        do{
            //store user input
            terminate = getNumberFromUser();

            //add number to list ONLY if it is valid
            addNumberOnly(list,terminate);

        //terminate if user entered "done"
        } while(!(terminate.equalsIgnoreCase("done")));

        //print the list
        printList(list);

        //get the average of the list
        double average = average(list);

        //get the maximum of the list
        int max = max(list);

        //get the minimum of the list
        int min = min(list);

        //get the standard deviation of the list
        double std = std(list);

        //print the results
        printStatistics(average,max,min,std);
    }
}
