package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest extends PaymentCalculator {

    //test constructor
    //note: the values are stored as doubles, but can be entered as int
    //note: inputting a decimal into APR instead of a percentage will offset the answer, but will not throw an
    //exception
    @Test
    void test_PaymentCalculator() {
        PaymentCalculator test = new PaymentCalculator(5,10,10);

        //test each value stores correctly

        //daily rate
        assertEquals(5.0/365/100,test.getDailyRate());

        //balance
        assertEquals(10.0,test.getBalance());

        //monthly payment
        assertEquals(10.0,test.getMonthlyPayment());
    }

    //test the calculation yields the correct value
    //note: returns the number of months as an int
    //note: the calculations involves cent rounding in the middle of the operation
    @Test
    void test_calculateMonthsUntilPaidOff() {
        PaymentCalculator test = new PaymentCalculator(12,5000,100);

        //test that the method calculates the correct number of months
        assertEquals(70,test.calculateMonthsUntilPaidOff());
    }
}