package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class DataMapTest extends DataMap {

    //initialize the maps
    @BeforeEach
    void initializeMapsBeforeEachTest() {
        initializeMaps();
    }

    //test that the four class maps were initialized correctly (by checking first and last values)
    //note: this also tests that the get() methods work for both calling the lists and calling values from indexes.
    @Test
    void test_initializeMaps() {
        //first names
        assertEquals("John", getStringFromMap(getMap("firstNames"), 0));
        assertEquals("Sally", getStringFromMap(getMap("firstNames"), 5));

        //last names
        assertEquals("Johnson", getStringFromMap(getMap("lastNames"), 0));
        assertEquals("Weber", getStringFromMap(getMap("lastNames"), 5));

        //positions
        assertEquals("Manager", getStringFromMap(getMap("positions"), 0));
        assertEquals("Web Developer", getStringFromMap(getMap("positions"), 5));

        //separation dates
        assertEquals("2016-12-31", getStringFromMap(getMap("separationDates"), 0));
        assertEquals("2015-12-18", getStringFromMap(getMap("separationDates"), 5));
    }

    //test the method that sorts a map
    @Test
    void test_sortMap() {
        //we really only need to test last names
        //since this isn't user driven, last names is the only category being sorted
        int i = 0;
        String[] lastNames = {"Jackson", "Jacobson", "Johnson", "Michaelson", "Weber", "Xiong"};
        Map<String, Integer> test = sortMap(getMap("lastNames"));
        for (Map.Entry<String, Integer> value : test.entrySet()) {
            assertEquals(lastNames[i], value.getKey());
            i++;
        }
    }

    //test the method that returns the key index of an entry
    @Test
    void test_getKeyFromEntry() {
        int i = 0;
        Map<String, Integer> temp = getMap("separationDates");
        Map<String, Integer> test = new TreeMap<>(temp);
        for (Map.Entry<String, Integer> value : test.entrySet()) {
            if (i==0) assertEquals(5,getKeyFromEntry(value));
            if (i==1) assertEquals(2,getKeyFromEntry(value));
            if (i==2) assertEquals(1,getKeyFromEntry(value));
            if (i==3) assertEquals(0,getKeyFromEntry(value));
            i++;
        }
    }

    //test the method that returns the string of an entry
    @Test
    void test_getStringFromEntry() {
        int i = 0;
        Map<String, Integer> temp = getMap("separationDates");
        Map<String, Integer> test = new TreeMap<>(temp);

        //make sure the separation dates are valid (no need to test others)
        for (Map.Entry<String, Integer> value : test.entrySet()) {
            if (i == 0) assertEquals("2015-12-18", getStringFromEntry(value));
            else if (i == 1) assertEquals("2015-12-19", getStringFromEntry(value));
            else if (i == 2) assertEquals("2016-10-15", getStringFromEntry(value));
            else if (i == 3) assertEquals("2016-12-31", getStringFromEntry(value));
            i++;
        }
    }
}