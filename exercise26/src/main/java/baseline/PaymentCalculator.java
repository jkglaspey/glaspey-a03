package baseline;

import java.util.Scanner;

public class PaymentCalculator {

    //create a class scanner
    private final Scanner in = new Scanner(System.in);

    //create instance variables for daily rate, balance, and monthly payment
    private double i;
    private double b;
    private double p;

    //create public constructor that stores variables needed to calculate the time it takes to pay off a credit card
    //balance.
    public PaymentCalculator(double APR, double balance, double monthlyPayment) {
        //store i as (APR / 100) / 365 rounded up to the nearest cent
        //store b as balance
        //store m as monthlyPayment
    }

    //create method that prompts user for values and stores them in an instance
    public PaymentCalculator createPaymentCalculator() {

        //create a double to store the APR
        double APR;
        //read APR from user and store in "APR"
        //create a double to store the balance
        double balance;
        //read balance from user and store in "balance"
        //create a double to store the monthly payment
        double monthlyPayment;
        //read monthly balance from user and store in "monthlyPayment"
        //create a new PaymentCalculator with "APR," "balance," and "monthlyPayment"
        return new PaymentCalculator(APR,balance,monthlyPayment);
    }

    //create method that returns the number of months needed to pay off credit card debt
    //takes no parameters
    //the number of months are rounded up to the next integer
    public int calculateMonthsUntilPaidOff() {

        //apply the formula: (n is the total number of months)
        //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        //round n up to the nearest integer
        //return n;
    }

    //create method that tells the user how many months until they can pay off their credit card debt
    public void printMonths(int months) {
        //print "It will take you "months" months to pay off this card."
    }
}
