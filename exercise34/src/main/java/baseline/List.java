/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

import java.util.Scanner;

public class List {

    //create class Scanner
    private static final Scanner in = new Scanner(System.in);

    //create instance variables
    private int size;
    private String[] names;

    //create public constructor with list of names and size of list
    public List(int size) {
        this.size = size;
        names = new String[size];
    }

    //create default constructor
    public List() {
        size = 1;
        names = new String[] {""};
    }

    //create method to get size of array
    public int getSize() { return size; }

    //create method to get the list of names
    public String[] getListOfNames() { return names; }

    //create method that gets a specific name in the list
    public String getName(int i) { return names[i]; }

    //create method to set a new array size
    public void setSize(int i) {
        this.size = i;
    }

    //create method to set a new list of names
    public void setNames(String[] names) {
        this.names = names;
    }

    //create a method to set a specific name in a list of names
    public void setName(String name, int i) {
        this.names[i] = name;
    }

    //create method to print every name in a list
    public void printNames() {
        System.out.printf("There are %d employees:%n",size);

        //print each name
        for(int i = 0; i < size; i++) {
            //try to print name, will print empty if there were duplicate names removed
            if (names[i] != null) System.out.printf("%s%n", names[i]);
        }

        //add extra white space
        System.out.print("\n");
    }

    //create method to ask user for a name to be deleted
    public static String askUserForName() {
        //ask user for name
        System.out.print("Enter an employee name to remove: ");

        //store value
        String input = in.nextLine();

        //add extra white space
        System.out.println();

        //return name
        return input;
    }

    //create method to delete the name from a list and save the list to the object
    public static void removeName(List names, String name) {
        //create a new String array of size "size-1"
        String[] newList = new String[names.getSize() - 1];

        //create an int to store the new size (in case of duplicates)
        int newSize = names.getSize();

        //create index values
        int i = 0;
        int j = 0;

        for(; i < names.getSize(); i++) {

            //if the name is not found
            if(!(names.getName(i).equalsIgnoreCase(name))) {

                //try to increment j, but it might throw exception
                try {
                    newList[j] = names.getName(i);
                    j++;
                }

                //the name is not found in the list
                catch(ArrayIndexOutOfBoundsException e) {
                    break;
                }
            }

            //if the name was found, do not increment j

            else {
                newSize--;
            }
        }

        //name was removed, return new list and fix size
        if(names.getSize() != newSize) {
            names.setNames(newList);
            names.setSize(newSize);
        }
    }
}
