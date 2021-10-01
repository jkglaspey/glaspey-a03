package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution36Test extends Solution36 {

    //warning: tests WILL NOT compile unless the following methods are set to public:
    // isEmpty(List<Integer> list)
    // addNumberToList(List<Integer> list, int x)

    //create an Array List to use in each test
    List<Integer> test1;
    List<Integer> test2;

    //initialize the list and give it values
    @BeforeEach
    public void setup_List() {
        //used for testing properties of the List
        test1 = initList();

        //used for calculating statistics
        test2 = initList();
        addNumberToList(test2,1);
        addNumberToList(test2,2);
        addNumberToList(test2,3);
        addNumberToList(test2,4);
        addNumberToList(test2,5);
    }

    //test the method that initializes the list
    //note: the array will be empty when it's initialized
    @Test
    void test_initArrayList() {
        assertTrue(test1.isEmpty());
    }

    //test the method that returns if the list is empty or not
    //note: this method is internal and is private. It is called to nullify empty calculations.
    @Test
    void test_isEmpty() {
        //test empty case
        assertTrue(isEmpty(test1));

        //test not-empty case
        test1.add(1);
        assertFalse(isEmpty(test1));
    }


    //test the method that adds a number to a list
    //note: this method is internal, and therefore is private. It is called by addNumberOnly
    //precondition: x is an int
    @Test
    void test_addNumberToList() {
        addNumberToList(test1,0);
        addNumberToList(test1,1);

        //test that the numbers were sequentially added to the list
        assertEquals(0, test1.get(0));
        assertEquals(1, test1.get(1));
    }

    //test the method that adds a number to a list ONLY if it is numeric
    //note: it will accept all input and only save valid ones. Therefore, it cannot be broken by user input.
    @Test
    void test_addNumberOnly() {
        //add 2 numbers to the list, while filtering out 2 bad inputs
        addNumberOnly(test1,"aaa");
        addNumberOnly(test1,"100");
        addNumberOnly(test1,"100aaa");
        addNumberOnly(test1,"1000");

        //verify the 2 numbers stored correctly
        assertEquals(100, test1.get(0));
        assertEquals(1000, test1.get(1));

        //verify those were the only 2 numbers that stored
        assertEquals(2, test1.size());
    }

    //note: none of the calculation methods will break on an empty list. Rather, they will return 0.
    //precondition for all calculations methods: an ArrayList<Integer> has been initialized.

    //test the method that calculates the total
    @Test
    void test_total() {
        //empty case
        assertEquals(0,total(test1));

        assertEquals(15,total(test2));
    }

    //test the method that calculates the average
    @Test
    void test_average() {
        //empty case
        assertEquals(0,average(test1));

        //populated case
        assertEquals(3.0,average(test2));
    }

    //test the method that calculates the maximum
    @Test
    void test_max() {
        //empty case
        assertEquals(0,max(test1));

        //populated case
        assertEquals(5,max(test2));
    }

    //test the method that calculates the minimum
    @Test
    void test_min() {
        //empty case
        assertEquals(0,min(test1));

        //populated case
        assertEquals(1,min(test2));
    }

    //test the method that calculates the standard deviation
    //note: the formula calculates as if the data is the population
    @Test
    void test_std() {
        //empty case
        assertEquals(0,std(test1));

        //round answer to 2 decimals
        double std = Math.round( std(test2) * 100.0) / 100.0;

        //populated case
        assertEquals(1.41,std);
    }
}