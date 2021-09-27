/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

public class Solution26 extends PaymentCalculator {

    public static void main(String[] args) {

        /*
        Write a program that will help you determine how many months it will take to pay off a credit card balance. The
        program should ask the user to enter the balance of a credit card, the APR of the card, and their monthly
        payment. The program should then return the number of months needed (rounded up to the next integer value).
         */

        //create a class to store the daily rate, balance, and monthly payment of a user
        //prompt user for input, where APR is to be entered as a percentage
        //store the input
        PaymentCalculator card = createPaymentCalculator();

        //calculate the total months it will take to pay off the debt
        int months = card.calculateMonthsUntilPaidOff();

        //print the result
        printMonths(months);
    }
}
