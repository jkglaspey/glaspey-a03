/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DataMap {

    //create constructor (to never be used)
    DataMap() {}

    //create class Scanner
    private static final Scanner in = new Scanner(System.in);

    //create private maps for each category
    private static Map<String,Integer> firstNames;
    private static Map<String,Integer> lastNames;
    private static Map<String,Integer> positions;
    private static Map<String,Integer> separationDates;

    //create method to initialize the maps
    //note: data is provided in example
    public static void initializeMaps() {
        firstNames = Map.ofEntries(
                Map.entry("John",0),
                Map.entry("Tou",1),
                Map.entry("Michaela",2),
                Map.entry("Jake",3),
                Map.entry("Jacquelyn",4),
                Map.entry("Sally",5)
        );
        lastNames = Map.ofEntries(
                Map.entry("Johnson",0),
                Map.entry("Xiong",1),
                Map.entry("Michaelson",2),
                Map.entry("Jacobson",3),
                Map.entry("Jackson",4),
                Map.entry("Weber",5)
        );
        positions = Map.ofEntries(
                Map.entry("Manager",0),
                Map.entry("Software Engineer",1),
                Map.entry("District Manager",2),
                Map.entry("Programmer",3),
                Map.entry("DBA",4),
                Map.entry("Web Developer",5)
        );
        separationDates  = Map.ofEntries(
                Map.entry("2016-12-31",0),
                Map.entry("2016-10-15",1),
                Map.entry("2015-12-19",2),
                Map.entry("2015-12-18",5)
        );
    }

    //create a method to prompt the user to input a search string
    public static String getInputFromUser() {
        //prompt user for input
        System.out.print("Enter a search string: ");

        return in.nextLine();
    }

    //create method to return a map via string
    public static Map<String,Integer> getMap(String s) {
        if(s.equalsIgnoreCase("firstNames")) return firstNames;
        if(s.equalsIgnoreCase("lastNames")) return lastNames;
        if(s.equalsIgnoreCase("positions")) return positions;
        if(s.equalsIgnoreCase("separationDates")) return separationDates;

        //return an empty map if string is not one of the class maps
        else return Map.of();
    }

    //create a method to sort a map
    //note: it will only be used to sort the last names
    public static Map<String,Integer> sortMap(Map<String,Integer> data) {
        //copy values of map to new tree map
        return new TreeMap<>(data);
    }

    //create method to return the key index from a specific map value
    public static int getKeyFromEntry(Map.Entry<String,Integer> data) {
        return data.getValue();
    }

    //create method to return the value from an entry
    public static String getStringFromEntry(Map.Entry<String,Integer> data) {
        return data.getKey();
    }

    //create a method to get the string from an index in a map
    public static <S,I> S getStringFromMap(Map<S,I> data, I indexKey) {//loop until we find the value
        for( Map.Entry<S,I> value : data.entrySet() ) {
            if(indexKey.equals(value.getValue())) return value.getKey();
        }

        //if value is missing, return blank string
        return null;
    }

    //create a method to see if a string exists within another string
    public static boolean stringExistsInsideString(String input, String name) {
        return name.contains(input);
    }

    //create a method to print the beginning of a table
    public static void printTableHeading() {
        System.out.printf("Results:%n%n%-29s | %-18s | %-15s%n","Name","Position","Separation Date");
                System.out.print("-------------------------------------------------------------------------\n");
    }

    //create a method to run through a map and print an entry who matches a string input
    public static void printFilteredTable(List<Map<String,Integer>> data, String input) {
        String name;
        String position;
        String date;
        int mapIndex;

        for( Map.Entry<String,Integer> value : data.get(1).entrySet() ) {
            //find the index for each map
            mapIndex = getKeyFromEntry(value);

            //concatenate the current name
            //note: rather than create another method to get the name from an entry (for last name), I recycled the map
            //method
            name = getStringFromMap(data.get(0),mapIndex) + " " + getStringFromEntry(value);

            //test if the input is contained in the name
            //if it is not contained, move to the next item
            if(stringExistsInsideString(input,name)) {
                //grab the current position
                position = getStringFromMap(data.get(2),mapIndex);

                //grab the current separation date
                date = getStringFromMap(data.get(3),mapIndex);

                //empty case
                if(date == null) date = "";

                //print result
                System.out.printf("%-29s | %-18s | %-15s%n",name,position,date);
            }
        }
    }
}
