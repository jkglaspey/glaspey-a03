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
        //initialize size
        //initialize an array of size "size"
    }

    //create default constructor
    public List() {
        //default values
    }

    //create method to get size of array
    public int getSize() { return size; }

    //create method to get the list of names
    public String[] getListOfNames() { return names; }

    //create method that gets a specific name in the list
    public String getName(int i) { return names[i]; }

    //create method to set a new array size
    public void setSize(int i) {
        this.size = 1;
    }

    //create method to set a new list of names
    public void setNames(String[] names) {
        this.names = names;
    }

    //create method to print every name in a list
    public void printNames() {
        //loop for the size of the list
        //print each name
    }

    //create method to ask user for a name to be deleted
    public static String askUserForName() {
        //ask user for name
        //return name
    }

    //create method to delete the name from a list and save the list to the object
    public void removeName(String name) {
        //create a new String array of size "size-1"
        //create int i = size and int j = size - 1
        //loop through the array using i
        //for each loop the name is not found:
        //  increment j
        //  List[i] = newList[j]
        //if the name is found:
        //  skip the name
        //  do not increment j
        //  set boolean for found to true
        //if name was found, assign newList to names list and assign size - 1 to size
    }
}
