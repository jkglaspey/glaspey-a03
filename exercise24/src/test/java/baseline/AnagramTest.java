package baseline;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest extends Anagram {

    @Test
    public void test_toCharArray() {
        //creating 2 arrays of the same value
        //note: this method removes any white space, and converts any capital letters to lower case.
        char[] test1 = new char[5];
        test1[0] = 'a';
        test1[1] = 'b';
        test1[2] = 'c';
        test1[3] = 'd';
        test1[4] = 'e';
        String string = "A BC D E";
        char[] test2 = toCharArray(string);

        //compares every character in each array
        //warning: do not compare the arrays directly, it will error
        for(int i = 0; i < 5; i++) {
            assertEquals(test1[i],test2[i]);
        }
    }

    @Test
    public void test_compareArrays() {
        //creating 2 character arrays with the same characters in different positions
        //warning: this method only sorts the arrays. White spaces and capital letters are dealt with in the
        //toCharArray() method. Having char values that are not the same in different positions will throw an
        //error.
        char[] test1 = new char[4];
        char[] test2 = new char[4];
        test1[0] = 'a';
        test1[1] = 'b';
        test1[2] = 'c';
        test1[3] = 'd';
        test2[0] = 'd';
        test2[1] = 'c';
        test2[2] = 'b';
        test2[3] = 'a';

        boolean test = true;
        assertEquals(test,compareArrays(test1,test2));
    }

    @Test
    public void test_isAnagram() {
        //create two strings of different orders and determine if they are anagrams
        //note: white spaces and capital letters are ignored
        //warning: having different characters, besides what's mentioned above, will throw an error
        String test1 = "Put Eliot's Toilet Up";
        String test2 = "put eliot's toilet up";

        boolean test = true;
        assertEquals(test,isAnagram(test1,test2));
    }
}