/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

public class Solution34 extends List {

    /*
    Create a small program that contains a list of employee names. Print out the list of names when the program runs the
    first time. Prompt for an employee name and remove that specific name from the list of names. Display the remaining
    employees, each on its own line.
     */

    public static void main(String[] args) {

        //create new List object with size preset
        List names = new List(5);

        //add names to List
        names.setName("John Smith",0);
        names.setName("Jackie Jackson",1);
        names.setName("Chris Jones",2);
        names.setName("Amanda Cullen",3);
        names.setName("Jeremy Goodwin",4);

        //print the list of names
        names.printNames();

        //ask user to enter a name to delete and store it in a string
        String name = askUserForName();

        //traverse list and remove that specific name
        removeName(names,name);

        //print the list of names
        names.printNames();
    }

}
