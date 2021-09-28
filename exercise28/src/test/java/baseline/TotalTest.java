package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TotalTest {

    //test the constructor
    //note: the constructor does not take parameters. It has one default instance variable to manage the total.
    @Test
    void Total() {

        //initialize the object
        Total test = new Total();

        assertEquals(0,test.getTotal());
    }

    //test the add() method
    //warning: add() only takes integer inputs. It will error when a non-numeric or float value is entered.
    @Test
    void add() {
        Total test = new Total();

        //add 5 to the object
        test.add(5);

        //add 3 to the object
        test.add(3);

        //add 100 to the object
        test.add(100);

        assertEquals(108,test.getTotal());
    }
}