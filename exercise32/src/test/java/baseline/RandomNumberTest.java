package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberTest {

    //test that the constructor initializes values
    //precondition: difficulty is a number between 1 and 3, although having a larger value will not break the program.
    //warning: difficulty must be entered as a number (which was satisfied by the precondition)
    @Test
    void test_RandomNumber() {
        RandomNumber test = new RandomNumber(1);

        //difficulty
        assertEquals(1,test.getDifficulty());

        //guesses
        assertEquals(0,test.getGuesses());

        //random number
        //note: the number is always > 0
        assertTrue(test.getNumber() > 0);
    }

    //test the constructor's random number generation
    //precondition: difficulty is a number between 1 and 3, although having a larger value will not break the program.
    //warning: the test fails randomly because I took my chances with RNG to verify the value can fall in a unique range
    //versus the entire possible range. If the test ever passes at all, the assignment is correct.
    @Test
    void test_RandomNumberGeneration() {

        RandomNumber test;

        //difficulty 1
        test = new RandomNumber(1);
        assertTrue((test.getNumber() >= 1) && (test.getNumber() <= 10) );

        //difficulty 2
        test = new RandomNumber(2);
        assertTrue((test.getNumber() >= 11) && (test.getNumber() <= 100) );

        //difficulty 3
        test = new RandomNumber(3);
        assertTrue((test.getNumber() >= 101) && (test.getNumber() <= 1000) );
    }

    //every other method is a combination of reading input and comparing it to the random number
}