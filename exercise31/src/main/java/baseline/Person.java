package baseline;

import java.util.Scanner;

public class Person {

    //create class Scanner
    private static final Scanner in = new Scanner(System.in);

    //create instance variables
    private final int age;
    private final int restingHR;

    //create public constructor
    public Person(int age, int restingHR) {
        //initialize values
    }

    //create method to get age
    public int getAge() { return age; }

    //create method to get resting heart rate
    public int getRestingHeartRate() { return restingHR; }

    //create method to read age from user
    public int getAgeFromUser() {

        //prompt for age
        //scan age
        //verify the data is numerical
        //return age
    }

    //create method to read resting heart rate from user
    public int getRestingHeartRateFromUser() {

        //prompt for resting heart rate
        //scan resting heart rate
        //verify the data is numerical
        //return resting heart rate
    }

    //create method to determine if a string is numeric
    public int isNumeric(String s) {
        //try to parse int
        //if error is thrown, then return 0
        //if no error, return 1
    }

    //create method to calculate the target heart rate
    public int calculateTargetHeartRate(int intensity) {
        return (((220 - age) - restingHR) * intensity) + restingHR;
    }

    //create method to print target heart rates by percentage
    public void printTargetHeartRates() {

        //print restingHR and age at top
        //print table headers for Intensity and Rate
        //loop for (95 - 55) / 5
        //calculate current target heart rate based off intensity
        //print intensity and target heart rate
    }
}
