package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test extends Solution33 {

    //test the method that generates a random number between 0 and 3
    //note: the method returns an int
    @Test
    void test_randomNumberGenerator() {

        //assert the random number is between 0 and 3
        assertTrue((generateRandomNumber() >= 0) && (generateRandomNumber() <= 3));
    }

    //test the method that prints a specific string in a list
    //note: this method returns a string and utilizes main to print the result
    @Test
    void test_printRandom() {
        String[] test = {"Print this one!","Not this one..."};

        assertEquals("Print this one!",printRandom(test,0));
    }
}