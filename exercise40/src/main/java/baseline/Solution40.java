/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution40 extends DataMap {

    /*
    Sorting records is helpful, but sometimes you need to filter down the results to find or display only what you’re
    looking for. Given the following data set create a program that lets a user locate all records that match the search
    string by comparing the search string to the first or last name field.
     */

    public static void main(String[] args) {
        //initialize the maps
        initializeMaps();

        //create an arrayList of maps
        List<Map<String,Integer>> data = new ArrayList<>();

        //save data maps to list
        data.add(getMap("firstNames"));
        data.add(getMap("lastNames"));
        data.add(getMap("positions"));
        data.add(getMap("separationDates"));

        //sort last names
        data.set(1,sortMap(data.get(1)));

        //read user input and save string
        String input = getInputFromUser();

        //print a table which includes only results containing the user input
        printTableHeading();
        printFilteredTable(data,input);
    }

}
