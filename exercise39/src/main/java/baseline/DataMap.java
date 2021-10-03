/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

import java.util.List;
import java.util.Map;

public abstract class DataMap {

    //create private maps for first names, last names, positions, and separation dates
    private static Map<Integer,String> firstNames;
    private static Map<Integer,String> lastNames;
    private static Map<Integer,String> positions;
    private static Map<Integer,String> separationDates;

    //create method to initialize the data maps
    public static void initializeMaps() {
        //store each of the values from the given data table in each map
        //use index values as keys
    }

    //create method to get a specific data map
    public static Map<Integer,String> getMap(String s) {
        //"s" will equal a specific string corresponding to each map
        //return the specific map
    }

    //create method to sort a specific data map in a list
    public static void sortMap(List<Map<Integer,String>> data, int i) {
        //use built-in map sorting method to sort list
        //sorts in natural order (which is also alphabetical)
        data.get(i).sort(null);
    }

    //create method to rearrange each data map in a list to match the order of one specific one (using keys)
    public static void sortEachMapBasedOnOne(List<Map<Integer,Sting>> data, int i) {
        //check that each map is of same length
        //if not, add blank values to match length of "sorted" array
        //if there's more values than the sorted array, then ignore those and append to the end
        //create new maps for each array to be sorted
        //loop for length of sorted array
        //  find the key value for each index of the sorted array, and copy to the first open position in the new map
        //  note: all keys will be found since they were all assigned in index order
        //override the old maps in data with new maps (besides sorted one)
    }

    //create method to oversee the sorting process
    public static void sortMapsBasedOn(List<Map<Integer,String>> data, int i) {
        //sortMap using same parameters
        //sortEachMapBasedOnOne using newly sorted Map from previous method call
    }

    //create method to print an arrayList of maps in a list
    public static void printListAsTable(List<Map<Integer,String>> data) {
        //create table headings
        //loop for length of one map (they're the same size)
        //  print: first + last name | position | separation date using formatting codes
        //  if a value is blank, print white space
    }
}
