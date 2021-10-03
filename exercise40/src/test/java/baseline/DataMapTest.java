package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class DataMapTest extends DataMap{

    //initialize maps
    @BeforeEach
    void initializeMapsBeforeTests() {
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
        //we really only need to test last names since this is the only list being sorted
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
        for (Map.Entry<String, Integer> value : test.entrySet()) {
            if (i==0) assertEquals("2015-12-18",getStringFromEntry(value));
            if (i==1) assertEquals("2015-12-19",getStringFromEntry(value));
            if (i==2) assertEquals("2016-10-15",getStringFromEntry(value));
            if (i==3) assertEquals("2016-12-31",getStringFromEntry(value));
            i++;
        }
    }

    //test the method that returns the string from a map at a specific index
    @Test
    void test_getStringFromMap() {
        //test for all of first name (if this map works, the other 3 work too)
        assertEquals("John",getStringFromMap(getMap("firstNames"),0));
        assertEquals("Tou",getStringFromMap(getMap("firstNames"),1));
        assertEquals("Michaela",getStringFromMap(getMap("firstNames"),2));
        assertEquals("Jake",getStringFromMap(getMap("firstNames"),3));
        assertEquals("Jacquelyn",getStringFromMap(getMap("firstNames"),4));
        assertEquals("Sally",getStringFromMap(getMap("firstNames"),5));
    }

    //test the method that determines if a string is inside another string
    @Test
    void test_stringExistsInsideString() {
        String s1;
        String s2;

        //true case
        s1 = "This is a test";
        s2 = "test";
        assertTrue(stringExistsInsideString(s2,s1));

        //false case
        s1 = "This is a test";
        s2 = "Monkey pineapple";
        assertFalse(stringExistsInsideString(s2,s1));
    }
}