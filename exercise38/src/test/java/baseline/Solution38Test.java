package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution38Test extends Solution38 {

    //create arrays and Strings for testing each method
    private static String string1;
    private static String string2;
    private static String string3;
    private static String string4;

    private static String[] stringList1;
    private static String[] stringList2;

    private static int[] intList1;
    private static int[] intList2;

    //initialize the values
    @BeforeEach
    void test_initializeValues() {

        //case 1: normal array of numbers
        string1 = "1 2 3 4 5 6";
        //case 2: array of both numbers and letters (with inconvenient spaces)
        string2 = "      1a 2a 24 test word 46 33 ";
        //case 3: null array
        string3 = null;
        //case 4: array with only spaces
        string4 = "     ";

        stringList1 = new String[] {"1", "2", "3", "4", "5", "6"};
        stringList2 = new String[] {"1a", "2a", "24", "test", "word", "46", "33"};

        intList1 = new int[] {2,4,6};
        intList2 = new int[] {24, 46};
    }

    //test method that counts the number of items in a string
    @Test
    void test_countNumOfItems() {
        int numOfItems;

        //case 1
        numOfItems = countNumOfItems(string1);
        assertEquals(6,numOfItems);

        //case 2
        numOfItems = countNumOfItems(string2);
        assertEquals(7,numOfItems);

        //case 3
        numOfItems = countNumOfItems(string3);
        assertEquals(0,numOfItems);

        //case 4
        numOfItems = countNumOfItems(string4);
        assertEquals(0,numOfItems);
    }

    //test the method that finds the first non-space character in a string
    //note: this method will never be run if the string is null
    @Test
    void test_findFirstNonSpace() {
        //case 1
        assertEquals(0,findFirstNonSpace(string1));

        //case 2
        assertEquals(6,findFirstNonSpace(string2));

        //we can skip case 3

        //case 4
        assertEquals(string4.length(),findFirstNonSpace(string4));
    }

    //test the method that converts a string to a string array
    @Test
    void test_convertStringToStringArray() {
        //case 1
        for(int i = 0; i < stringList1.length; i++) {
            assertEquals(stringList1[i],convertStringToStringArray(string1)[i]);
        }

        //case 2
        for(int i = 0; i < stringList2.length; i++) {
            assertEquals(stringList2[i], convertStringToStringArray(string2)[i]);
        }

        //case 3
        assertEquals(0, convertStringToStringArray(string3).length);

        //case 4
        assertEquals(0, convertStringToStringArray(string4).length);
    }

    //test the method that nullifies non-numeric non-even data
    @Test
    void test_nullifyNonEvenDataAndReturnTotal() {
        //case 1
        int total = nullifyNonEvenDataAndReturnTotal(stringList1);
        assertEquals(null,stringList1[0]);
        assertEquals("2",stringList1[1]);
        assertEquals(null,stringList1[2]);
        assertEquals("4",stringList1[3]);
        assertEquals(null,stringList1[4]);
        assertEquals("6",stringList1[5]);
        assertEquals(3,total);

        //case 2
        total = nullifyNonEvenDataAndReturnTotal(stringList2);
        assertEquals(null,stringList2[0]);
        assertEquals(null,stringList2[1]);
        assertEquals("24",stringList2[2]);
        assertEquals(null,stringList2[3]);
        assertEquals(null,stringList2[4]);
        assertEquals("46",stringList2[5]);
        assertEquals(null,stringList2[6]);
        assertEquals(2,total);

        //case 3
        String[] test = new String[0];
        total = nullifyNonEvenDataAndReturnTotal(test);
        assertEquals(0,total);
    }

    //test the method that takes an array of strings and converts it to an array of even integers
    //note: we confirmed that method nullifyNonEvenDataAndReturnTotal works, so we can implement it here
    @Test
    void test_filterEvenNumbers() {
        //case 1
        int[] intList1 = filterEvenNumbers(stringList1, nullifyNonEvenDataAndReturnTotal(stringList1));
        assertEquals(2,intList1[0]);
        assertEquals(4,intList1[1]);
        assertEquals(6,intList1[2]);
        assertEquals(3,intList1.length);

        //case 2
        int[] intList2 = filterEvenNumbers(stringList2, nullifyNonEvenDataAndReturnTotal(stringList2));
        assertEquals(24,intList2[0]);
        assertEquals(46,intList2[1]);
        assertEquals(2,intList2.length);

        //note: we do not need to test the null case since this method is internal and has a pre-conditional check to
        //ensure an empty array does not appear.
    }

    //test the method that uses all string and array modification methods to create an array of even integers
    @Test
    void test_convertStringToEvenIntegerArray() {
        //test 1
        int[] intList1 = convertStringToEvenIntegerArray(string1);
        assertEquals(2,intList1[0]);
        assertEquals(4,intList1[1]);
        assertEquals(6,intList1[2]);
        assertEquals(3,intList1.length);

        //test2
        int[] intList2 = convertStringToEvenIntegerArray(string2);
        assertEquals(24,intList2[0]);
        assertEquals(46,intList2[1]);
        assertEquals(2,intList2.length);

        //test3
        int[] intList3 = convertStringToEvenIntegerArray(string3);
        assertEquals(0,intList3.length);

        //test4
        int[] intList4 = convertStringToEvenIntegerArray(string4);
        assertEquals(0,intList4.length);
    }
}