package baseline;

import java.util.Scanner;
import static java.lang.Math.log;

public class PaymentCalculator {

    //create a class scanner
    private static final Scanner in = new Scanner(System.in);

    //create instance variables for daily rate, balance, and monthly payment
    private final double i;
    private final double b;
    private final double p;

    //create public constructor that stores variables needed to calculate the time it takes to pay off a credit card
    //balance.
    public PaymentCalculator(double apr, double balance, double monthlyPayment) {
        i = apr / 365 / 100;
        b = balance;
        p = monthlyPayment;
    }

    //create default constructor
    public PaymentCalculator() {
        i = 0;
        b = 0;
        p = 0;
    }

    //create method that gets the daily rate
    public double getDailyRate() { return i; }

    //create method that gets the balance
    public double getBalance() { return b; }

    //create method that gets the monthly payment
    public double getMonthlyPayment() { return p; }

    //create method that prompts user for values and stores them in an instance
    public static PaymentCalculator createPaymentCalculator() {

        //read balance from user and store in "balance"
        System.out.print("What is your balance?  ");
        double balance = in.nextDouble();

        //read APR from user and store in "APR"
        System.out.print("What is the APR on the card (as a percent)?  ");
        double apr = in.nextDouble();

        //read monthly balance from user and store in "monthlyPayment"
        System.out.print("What is the monthly payment you can make?  ");
        double monthlyPayment = in.nextDouble();

        //create a new PaymentCalculator with "APR," "balance," and "monthlyPayment"
        return new PaymentCalculator(apr,balance,monthlyPayment);
    }

    //create method that returns the number of months needed to pay off credit card debt
    //takes no parameters
    //the number of months are rounded up to the next integer
    public int calculateMonthsUntilPaidOff() {

        //perform early calculations that involve rounding
        double round = Math.ceil(b / p * 100) / 100.0;

        //apply the formula: (n is the total number of months)
        double n = -1 * (1 / 30.0) * log(1 + round * (1 - Math.pow(1 + i,30))) / log(1 + i);

        //return the number of months (rounded up) as an int;
        return (int)Math.ceil(n);
    }

    //create method that tells the user how many months until they can pay off their credit card debt
    public static void printMonths(int months) {
        System.out.printf("It will take you %d months to pay off this card.",months);
    }
}
