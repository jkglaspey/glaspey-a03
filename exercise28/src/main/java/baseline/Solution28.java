/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

public class Solution28 extends Total {

    public static void main(String[] args) {

        //create a new Total object
        Total total = new Total();

        //loop for amount of times a number is to be added
        for(int i = 0; i < 5; i++) {
            total.add( askUserForInput() );
        }

        //print result
        total.printTotal();
    }
}
