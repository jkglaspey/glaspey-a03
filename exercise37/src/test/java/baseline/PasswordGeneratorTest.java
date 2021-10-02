package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest extends PasswordGenerator {

    //declare variables to be passed through to the test methods
    private static int minimumValue;
    private static int numOfNumbers;
    private static int numOfSpecialCharacters;

    private static PasswordGenerator test;

    //initialize variables to be passed through to the test methods
    //initialize minimum, number of numbers, and number of special character ints
    //note: we do not initialize the password object because the class lists would be initialized as well.
    @BeforeEach
    public void initialize_classVariables() {
        minimumValue = 8;
        numOfNumbers = 2;
        numOfSpecialCharacters = 2;
    }

    //test the public constructor
    @Test
    void test_PasswordGenerator() {
        //create a new object to localize the test
        PasswordGenerator password = new PasswordGenerator(8, 2, 2);

        //verify the length is stored (and random)
        assertTrue(password.getPasswordLength() >= 8);

        //verify the password was created
        assertFalse(password.getPassword().equals(""));
    }

    //test that the constructor will adjust the minimumNumbers value to be proper size
    @Test
    void test_PasswordGeneratorAdjustsSize() {
        //create a new object to localize the test
        PasswordGenerator password = new PasswordGenerator(2, 2, 2);

        //verify the length was changed to at least 8
        assertTrue(password.getPasswordLength() >= 8);
    }

    //test the method that initializes the letters array
    @Test
    void test_initializeLettersList() {
        initializeLettersList();

        //test if the letters list was created correctly
        assertEquals("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ",String.valueOf(getClassList("letters")));
    }

    //test the method that initializes the numbers array
    @Test
    void test_initializeNumbersList() {
        initializeNumbersList();

        //test if the numbers list was created correctly
        assertEquals("0123456789",String.valueOf(getClassList("numbers")));
    }

    //test the method that initializes the special characters array
    @Test
    void test_initializeSpecialCharactersList() {
        initializeSpecialCharactersList();

        //test if the special characters list was created correctly
        assertEquals("!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~",String.valueOf(getClassList("special characters")));
    }

    //test the method that generates a random password length
    @Test
    void test_generateRandomPasswordLength() {
        //randomly generate a password length that can be 1 or greater
        minimumValue = generatePasswordLength(1);

        //ensure the length did not shrink or nullify
        assertTrue( minimumValue > 0);
    }

    //test the method that generates a random password with all types of characters
    @Test
    void test_generateRandomPasswordValidity() {
        initializeLettersList();
        initializeNumbersList();
        initializeSpecialCharactersList();

        String password = generatePassword(minimumValue,numOfNumbers,numOfSpecialCharacters);

        //verify the password is 8 digits
        assertEquals(8,password.length());

        //find total letters, numbers, and special characters in password
        int letters = 0;
        int numbers = 0;
        int specialCharacters = 0;
        for(int i = 0; i < password.length(); i++) {
            if((password.charAt(i) >= 97 ) && (password.charAt(i) <= 122 )) letters++;
            else if((password.charAt(i) >= 65 ) && (password.charAt(i) <= 90 )) letters++;
            else if((password.charAt(i) >= 48 ) && (password.charAt(i) <= 57 )) numbers++;
            else specialCharacters++;
        }

        //verify the numbers
        assertEquals(4,letters);
        assertEquals(2,numbers);
        assertEquals(2,specialCharacters);
    }

    //test the method that generates a random password without numbers
    @Test
    void test_generateRandomPasswordWithoutNumbers() {
        initializeLettersList();
        initializeSpecialCharactersList();

        String password = generatePassword(minimumValue,0,numOfSpecialCharacters);

        //verify the password is 8 digits
        assertEquals(8,password.length());

        //find total letters, numbers, and special characters in password
        int letters = 0;
        int numbers = 0;
        int specialCharacters = 0;
        for(int i = 0; i < password.length(); i++) {
            if((password.charAt(i) >= 97 ) && (password.charAt(i) <= 122 )) letters++;
            else if((password.charAt(i) >= 65 ) && (password.charAt(i) <= 90 )) letters++;
            else if((password.charAt(i) >= 48 ) && (password.charAt(i) <= 57 )) numbers++;
            else specialCharacters++;
        }

        //verify the numbers
        assertEquals(6,letters);
        assertEquals(0,numbers);
        assertEquals(2,specialCharacters);
    }

    //test the method that generates a random password with no special characters
    @Test
    void test_generateRandomPasswordWithoutSpecialCharacters() {
        initializeLettersList();
        initializeNumbersList();

        String password = generatePassword(minimumValue,numOfNumbers,0);

        //verify the password is 8 digits
        assertEquals(8,password.length());

        //find total letters, numbers, and special characters in password
        int letters = 0;
        int numbers = 0;
        int specialCharacters = 0;
        for(int i = 0; i < password.length(); i++) {
            if((password.charAt(i) >= 97 ) && (password.charAt(i) <= 122 )) letters++;
            else if((password.charAt(i) >= 65 ) && (password.charAt(i) <= 90 )) letters++;
            else if((password.charAt(i) >= 48 ) && (password.charAt(i) <= 57 )) numbers++;
            else specialCharacters++;
        }

        //verify the numbers
        assertEquals(6,letters);
        assertEquals(2,numbers);
        assertEquals(0,specialCharacters);
    }

    //test the method that generates a random password, but there's no length
    @Test
    void test_generateRandomPasswordButNoLength() {

        String password = generatePassword(0,0,0);

        //verify the password is 0 digits
        assertEquals(0,password.length());
    }

    //test the constructor for a random password, but with no length
    @Test
    void test_generateRandomPasswordObjectButNoLength() {
        test = new PasswordGenerator(0,0,0);

        //verify the password length is not null
        assertTrue(test.getPasswordLength() >= 0);

        //verify the password is not null
        assertNotEquals(null,test.getPassword());
    }
}