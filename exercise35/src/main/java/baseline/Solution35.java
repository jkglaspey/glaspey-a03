/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Solution35 {

    /*
    Create a program that picks a winner for a contest or prize drawing. Prompt for names of contestants until the user
    the entry blank. Then randomly select a winner.
     */

    //create a class Scanner
    private static final Scanner in = new Scanner(System.in);

    //create a class Random
    private static final Random random = new Random();

    //create a method that will ask the user for a name, then return the result (including "").
    public static String getNameFromUser() {
        //prompt user to enter a name
        System.out.print("Enter a name: ");

        //return the next line
        return in.nextLine();
    }

    //create a method to initialize a new ArrayList
    public static List<String> initArrayList() { return new ArrayList<>(); }

    //create a method that will add a name to an ArrayList
    public static void addNameToList(List<String> list, String name) {
        //add name to the back of the Array List
        list.add(name);
    }

    //create a method that will return a random number between 0 and the upper bound
    //note: top will equal the size of the ArrayList
    public static int generateRandomNumber(int top) {
        //generate random number between 0 and top
        return random.nextInt(top);
    }

    //create a method that will print the name of the person at a specific index value
    public static void printWinner(List<String> list, int index) {
        //print the name at index "index"
        System.out.printf("The winner is... %s",list.get(index));
    }

    public static void main(String[] args) {
        //initialize a new ArrayList
        List<String> list = initArrayList();

        //loop to ask user for name
        String input;
        do{
            //save the input as a string, so we can check if it's ""
            input = getNameFromUser();

            //terminate when the result is ""
            if(input.equals("")) break;

            //if the user inputs a name, add the name to the end of the list
            addNameToList(list,input);
        } while(true);

        //generate a random index within the size of the list
        int index = generateRandomNumber(list.size());

        //print the name at the random index
        printWinner(list,index);
    }
}
