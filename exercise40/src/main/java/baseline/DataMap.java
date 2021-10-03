package baseline;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DataMap {

    //create class Scanner
    Scanner in = new Scanner(System.in);

    //create private maps for each category
    private static Map<String,Integer> firstNames;
    private static Map<String,Integer> lastNames;
    private static Map<String,Integer> positions;
    private static Map<String,Integer> separationDates;

    //create method to initialize the maps
    public static void initializeMaps() {
        //fill in the data for the four maps
    }

    //create a method to prompt the user to input a search string
    public static String getInputFromUser() {
        //prompt user for input
        //return next line
    }

    //create method to return a map via string
    public static Map<String,Integer> getMap(String s) {
        //return one of the four maps depending on what "s" is
        //if "s" is incorrect, return null
    }

    //create a method to get the string from an index in a map
    public static <String,Integer> String getStringFromMap(Map<String,Integer> data, int index) {
        //create a new int to represent the current place in the map
        int i = 0;
        //loop with for-each
        //if the loop index matches the parameter index, return that string
        //if not existent, return null
    }

    //create a method to print the beginning of a table
    public static void printTableHeading() {
        //print Name | Position | Separation Date
        // ---------------------------------------
    }

    //create a method to run through a map and print an entry who matches a string input
    public static void printFilteredTable(List<Map<String,Integer>> data, String s) {
        //loop through the size of one map
        //for each entry, compare the string to the map data in both the names map
        //if it finds a match, print the entry into the table
        //if not, skip it
    }
}
