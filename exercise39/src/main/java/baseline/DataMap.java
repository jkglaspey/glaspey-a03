/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DataMap {

    //create default constructor
    DataMap() {
        //throw new UnsupportedOperationException();
    }

    //create private maps for first names, last names, positions, and separation dates
    private static Map<String,Integer> firstNames;
    private static Map<String,Integer> lastNames;
    private static Map<String,Integer> positions;
    private static Map<String,Integer> separationDates;

    //create method to initialize the data maps
    //note: index values are the corresponding data keys
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

    //create method to get a specific map
    //precondition: the class maps have been initialized
    public static Map<String,Integer> getMap(String s) {
        if(s.equalsIgnoreCase("firstNames")) return firstNames;
        if(s.equalsIgnoreCase("lastNames")) return lastNames;
        if(s.equalsIgnoreCase("positions")) return positions;
        if(s.equalsIgnoreCase("separationDates")) return separationDates;

        //return an empty map if string is not one of the class maps
        else return Map.of();
    }

    //create method to sort a specific data map in a list
    //note: sorts in natural order (which is also alphabetical)
    public static Map<String,Integer> sortMap(Map<String,Integer> data) {
        //copy values of map to new tree map
        return new TreeMap<>(data);
    }

    //create method to get the specific key from a map entry
    public static int getKeyFromEntry(Map.Entry<String,Integer> data) {
        return data.getValue();
    }

    //create method to get the specific value (not index key) that matches an index key
    public static <S,I> S getStringFromMap(Map<S,I> data, I indexKey) {
        //loop until we find the value
        for( Map.Entry<S,I> value : data.entrySet() ) {
            if(indexKey.equals(value.getValue())) return value.getKey();
        }

        //if value is missing, return blank string
        return null;
    }

    //create method to get a specific value from a specific map entry
    public static String getStringFromEntry(Map.Entry<String,Integer> data) {
        return data.getKey();
    }

    //create method to print an arrayList of maps in a list
    public static void printListAsTableBasedOnLastNames(List<Map<String,Integer>> data) {
        //create table headings
        System.out.printf("%-29s | %-18s | %-15s%n","Name","Position","Separation Date");
        System.out.print("-------------------------------------------------------------------------\n");

        //create variables to be assigned inside loop
        int keyValue;
        String name;
        String position;
        String date;

        //loop each for length of one map (they're the same size)
        for(Map.Entry<String,Integer> value : data.get(1).entrySet()) {
            //get the key value from last name
            keyValue = getKeyFromEntry(value);

            //assign strings via maps
            name = getStringFromMap(data.get(0),keyValue) + " " + getStringFromEntry(value);
            position = getStringFromMap(data.get(2),keyValue);
            date = getStringFromMap(data.get(3),keyValue);
            if(date == null) date = "";

            //  print: first + last name | position | separation date using formatting codes
            //  if a value is blank, print white space
            System.out.printf("%-29s | %-18s | %-15s%n",name,position,date);
        }
    }
}
