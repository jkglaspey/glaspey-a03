package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest extends Password {

    //note: to test methods, change methods from private to public

    //test the Password object
    @Test
    void test_Password() {
        //note: the password constructor only requires the password itself. The length is measured from string
        //length, the string is converted into a char[] array, and the strength is defined from the
        //validatePassword() method.
        String password = "test";
        Password test = new Password(password);
        char[] test1 = new char[4];
        test1[0] = 't';
        test1[1] = 'e';
        test1[2] = 's';
        test1[3] = 't';
        int test2 = 4;
        int test3 = 0;

        //warning: directly comparing arrays does not pass the assertEquals test, so I had to compare each
        //individual character in the array.
        //note: you cannot define the strength until the validatePassword method has
        //been run, but defining it to be any value in this test would not throw an exception.
        for(int i = 0; i < 4; i++) {
            assertEquals(test1[i],test.getPassword()[i]);
        }
        assertEquals(test2,test.getLength());
        assertEquals(test3,test.getStrength());
    }

    //test method that converts strings to char arrays
    //warning: this method only accepts strings
    //note: the length does not need to be predefined, it will use length().
    @Test
    void test_toCharArray() {

        String password = "abc123";
        char[] test = toCharArray(password);
        char[] test1 = new char[6];
        test1[0] = 'a';
        test1[1] = 'b';
        test1[2] = 'c';
        test1[3] = '1';
        test1[4] = '2';
        test1[5] = '3';
        for(int i = 0; i < 6; i++) {
            assertEquals(test1[i],test[i]);
        }
    }

    //test method that catches any letters in a char[] array
    //note: it catches both capital and lower case letters
    //note: it will not break on special characters
    @Test
    void test_isLettersInPassword() {

        //testing that lower case letters are recognized
        Password test = new Password("1234567890a");
        assertTrue(test.isLettersInPassword());

        //testing that false cases are recognized
        test = new Password("12345");
        assertFalse(test.isLettersInPassword());

        //testing that upper case letters are recognized
        test = new Password("A");
        assertTrue(test.isLettersInPassword());
    }

    //test method that catches any numbers in a char[] array
    //note: it will not break on special characters
    @Test
    void test_isNumbersInPassword() {

        //testing that numbers are recognized
        Password test = new Password("abcde1");
        assertTrue(test.isNumbersInPassword());

        //testing that false cases are recognized
        test = new Password("abcde");
        assertFalse(test.isNumbersInPassword());
    }

    //test method that catches any special characters in a char[] array
    //note: this includes spaces
    //note: the range excludes only numbers and letters. Every other char on the ascii table is valid
    @Test
    void test_isSpecialCharactersInPassword() {

        //testing that spaces are recognized
        Password test = new Password("ha ha");
        assertTrue(test.isSpecialCharactersInPassword());

        //testing that false cases are recognized
        test = new Password("abcde");
        assertFalse(test.isSpecialCharactersInPassword());

        //testing that obscure characters are recognized
        test = new Password("'");
        assertTrue(test.isSpecialCharactersInPassword());

        test = new Password(">");
        assertTrue(test.isSpecialCharactersInPassword());

        test = new Password("%");
        assertTrue(test.isSpecialCharactersInPassword());
    }

    //test method that determines the strength of a password
    //warning: a password MUST be defined, or this function cannot run
    //note: this function can be run multiple times and will not break
    @Test
    void test_passwordValidator() {

        //test password of strength 1
        Password test = new Password("12345");
        passwordValidator(test);
        assertEquals(1,test.getStrength());

        //test password of strength 2
        test = new Password("abcde");
        passwordValidator(test);
        assertEquals(2,test.getStrength());

        //test password of strength 3
        test = new Password("abcde12345");
        passwordValidator(test);
        assertEquals(3,test.getStrength());

        //test password of strength 4
        test = new Password("abcde12345^&*()");
        passwordValidator(test);
        assertEquals(4,test.getStrength());

        //test password of strength 0
        test = new Password("a1");
        passwordValidator(test);
        assertEquals(0,test.getStrength());
    }
}