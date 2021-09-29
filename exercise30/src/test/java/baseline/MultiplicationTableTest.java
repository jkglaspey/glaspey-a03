package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTableTest {

    //test the record
    @Test
    void test_MultiplicationTable() {

        //create new table
        MultiplicationTable test = new MultiplicationTable(1,12);

        //test values stored correctly
        assertEquals(1,test.getLow());
        assertEquals(12,test.getHigh());
    }

    //test the calculations
    //note: this method is a void return type. It was modified to return an int[][] for testing to verify the
    //calculations were correct, but it was reverted after the math was checked.
    /*
    @Test
    void test_printTable() {

        //create an array of multiples of values from 1-5, inclusive. Then check if they match the table from the
        //method.
        //warning: if the block comment of code in printTable is not removed, and the return type changed to in[][],
        //this test will fail.
        //note: tables from any low and high value can be created, but creating large disparities may jeopardize run
        //time.
        int[][] test1 = new int[5][5];
        MultiplicationTable table = new MultiplicationTable(1,5);
        int[][] test2 = table.printTable();
        for(int i = 0; i <= 4; i++) {
            for(int j = 0; j <= 4; j++) {
                test1[i][j] = (i + 1) * (j + 1);
                assertEquals(test1[i][j],test2[i][j]);
            }
        }
    }
    */
}