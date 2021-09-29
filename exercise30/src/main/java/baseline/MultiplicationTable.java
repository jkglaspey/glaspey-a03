/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

public record MultiplicationTable(int low, int high) {

    //create method to get the low value
    public int getLow() {
        return low;
    }

    //create method to get the high value
    public int getHigh() {
        return high;
    }

    //create method to print a table
    public void printTable() {

        //nest the loops
        for (int i = low; i <= high; i++) {
            for (int j = low; j <= high; j++) {

                //print each value within 5 spaces
                System.out.printf("%5d", j * i);
            }
            System.out.println();
        }

        //testing block: only enable if running MultiplicationTableTest class
        /*
        int[][] table = new int[high - low + 1][high - low + 1];
        for(int i = 0; i <= high - low; i++) {
            for(int j = 0; j <= high - low; j++) {
                table[i][j] = (i + low) * (j + low);
            }
        }
        return table;
         */
    }
}
