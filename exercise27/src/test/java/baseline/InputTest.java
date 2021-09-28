package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputTest {

    //test the constructor
    //note: the zipCode is entered as a string and converted in the validation method.
    @Test
    void Input() {
        Input test = new Input("Joshua", "Glaspey", "32817", "Aa-0189");

        //test first name
        assertEquals("Joshua", test.getFirstName());
        //test last name
        assertEquals("Glaspey", test.getLastName());
        //test ZIP code
        assertEquals("32817", test.getZIPCode());
        //test employee ID
        assertEquals("Aa-0189", test.getEmployeeID());
    }

    //test the method that validates that the first name is at least 2 characters.
    //note: will throw another error when there is no input at all.
    @Test
    void validateFirstName() {

        //test correct name
        Input test = new Input("John", "Test", "11111", "AA-1111");
        assertTrue(test.validateFirstName());

        //test incorrect names:

        //the name is 1 character
        test = new Input("J", "Test", "11111", "AA-1111");
        assertFalse(test.validateFirstName());

        //the name is 0 characters
        test = new Input("", "Test", "11111", "AA-1111");
        assertFalse(test.validateFirstName());
    }

    //test the method that validates that the last name is at least 2 characters.
    //note: will throw another error when there is no input at all.
    @Test
    void validateLastName() {
        //test correct name
        Input test = new Input("John", "Test", "11111", "AA-1111");
        assertTrue(test.validateLastName());

        //test incorrect names:

        //the name is 1 character
        test = new Input("John", "T", "11111", "AA-1111");
        assertFalse(test.validateLastName());

        //the name is 0 characters
        test = new Input("John", "", "11111", "AA-1111");
        assertFalse(test.validateLastName());
    }

    //test the method that validates that the employee ID is of the correct format.
    @Test
    void validateEmployeeID() {
        //test correct ID
        Input test = new Input("John", "Test", "11111", "AA-1111");
        assertTrue(test.validateEmployeeID());

        //test incorrect ID's:

        //the ID contains numbers in the first section
        test = new Input("John", "Test", "11111", "A1-1111");
        assertFalse(test.validateEmployeeID());

        //the ID contains letters in the second section
        test = new Input("John", "Test", "11111", "AA-A111");
        assertFalse(test.validateEmployeeID());

        //the ID does not contain a hyphen in the 3rd position
        test = new Input("John", "Test", "11111", "AAA1111");
        assertFalse(test.validateEmployeeID());

        //the ID is not of length seven
        test = new Input("John", "Test", "11111", "AA-11");
        assertFalse(test.validateEmployeeID());
    }

    //test the method that validates that the zip code is a list of five numbers
    @Test
    void validateZIPCode() {
        //test correct ZIP code
        Input test = new Input("John", "Test", "11111", "AA-1111");
        assertTrue(test.validateZIPCode());

        //test incorrect ZIP codes:

        //the code is too short
        test = new Input("John", "Test", "1111", "AA-1111");
        assertFalse(test.validateZIPCode());

        //the code is too long
        test = new Input("John", "Test", "111111", "AA-1111");
        assertFalse(test.validateZIPCode());

        //the code has non-numeric chacters
        test = new Input("John", "Test", "111ab", "AA-1111");
        assertFalse(test.validateZIPCode());
    }
}

