package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test extends Solution29 {

    //test method that errors on incorrect user input
    //note: this method catches non-numeric values and defaults them to 0
    //note: this method is for use in the askUserForInput() method only.
    //to test this method, change isNonZeroInt to public
    @Test
    void test_isNonZeroInt() {

        //test that it returns the value if the String is a non-zero int
        int test = isNonZeroInt("1");
        assertEquals(1,test);

        //test that it returns 0 if the String is 0
        test = isNonZeroInt("0");
        assertEquals(0,test);

        //test that it returns the negative value if the String is negative
        test = isNonZeroInt("-1");
        assertEquals(-1,test);

        //test that it returns 0 if the String is non-numeric
        test = isNonZeroInt("ABC");
        assertEquals(0,test);
    }

    //test the method that calculates the number of years
    //warning: this method only takes in an int value. It will break on non-numeric or decimal parameters.
    @Test
    void test_calculateYears() {

        //test the example provided by the sample
        int years = calculateYears(4);
        assertEquals(18,years);

        //test that the years rounds up
        //note: 72 / 5 = 14.4
        years = calculateYears(5);
        assertEquals(15,years);
    }
}