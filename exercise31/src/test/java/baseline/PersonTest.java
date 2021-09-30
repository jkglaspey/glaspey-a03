package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest extends Person {

    //test the constructor
    @Test
    void test_Person() {
        Person test = new Person(10,60);

        //assert that the values stored correctly
        assertEquals(10,test.getAge());
        assertEquals(60,test.getRestingHeartRate());
    }

    //test the method that verifies the input is numeric
    @Test
    void test_isNumeric() {

        //assert that numeric values pass
        assertEquals(1,isNumeric("1"));

        //assert that non-numeric values return 0
        assertEquals(0,isNumeric("abc"));
    }

    //test the method that calculates the target heart rate
    //note: this method requires both a Person object and an intensity (as a percent).
    //note: this method was designed for all valid percentage values (0-100), however inputting outside this range will
    //not break the function.
    @Test
    void test_calculateTargetHeartRate() {

        Person test = new Person(19,60);

        //assert that all intensities give the right answer
        //note: the answers are rounded to the nearest whole number
        assertEquals(138,test.calculateTargetHeartRate(55));
        assertEquals(145,test.calculateTargetHeartRate(60));
        assertEquals(152,test.calculateTargetHeartRate(65));
        assertEquals(159,test.calculateTargetHeartRate(70));
        assertEquals(166,test.calculateTargetHeartRate(75));
        assertEquals(173,test.calculateTargetHeartRate(80));
        assertEquals(180,test.calculateTargetHeartRate(85));
        assertEquals(187,test.calculateTargetHeartRate(90));
        assertEquals(194,test.calculateTargetHeartRate(95));
    }
}