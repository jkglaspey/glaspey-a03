/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution39 extends DataMap {

    /*
    Given the following data set, create a program that sorts all employees by last name and prints them to the screen
    in a tabular format.
     */

    public static void main(String[] args) {
        //initialize the maps in class DataMap
        initializeMaps();

        //create a list of maps
        List<Map<String,Integer>> data = new ArrayList<>();

        //add the data maps to the list
        data.add(getMap("firstNames"));
        data.add(getMap("lastNames"));
        data.add(getMap("positions"));
        data.add(getMap("separationDates"));

        //sort the data in a specific category (in this case last names) and replace that value
        data.set(1,sortMap(data.get(1)));

        //print the results in a table sorted by a map (last names)
        printListAsTableBasedOnLastNames(data);
    }
}