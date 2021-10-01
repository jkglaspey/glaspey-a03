package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test extends Solution35 {

    //test that the ArrayList is initialized
    //note: initArrayList() only creates a new ArrayList, it does not add any values
    @Test
    void test_initArrayList() {
        List<String> test = initArrayList();

        assertTrue(test.isEmpty());
    }

    //test that addNameToList adds names to an ArrayList
    //note: it will always add a name to the end of the list
    @Test
    void test_addNameToList() {
        List<String> test = new ArrayList<>();
        addNameToList(test,"Homer");
        addNameToList(test,"Bart");
        addNameToList(test,"Maggie");

        assertEquals("Homer",test.get(0));
        assertEquals("Bart",test.get(1));
        assertEquals("Maggie",test.get(2));
    }

    //test that generateRandomNumber generates a random number within the range of 0 - top
    @Test
    void test_generateRandomNumber() {
        List<String> test = new ArrayList<>();
        test.add("Homer");
        test.add("Bart");
        test.add("Maggie");

        int x = generateRandomNumber(test.size());

        assertTrue((x >= 0) && (x < 3));
    }
}