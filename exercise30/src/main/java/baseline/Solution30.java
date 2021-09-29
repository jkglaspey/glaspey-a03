package baseline;

public class Solution30 {

    /*
    Create a program that generates a multiplication table for the numbers 1 through 12 (inclusive).
     */

    public static void main(String[] args) {

        //create a new table object
        MultiplicationTable table = new MultiplicationTable(1,12);

        //call method to create and print the table
        table.printTable();
    }
}
