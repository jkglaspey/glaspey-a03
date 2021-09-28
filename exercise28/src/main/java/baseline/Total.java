package baseline;

import java.util.Scanner;

public class Total {

    //create class Scanner
    private static final Scanner in = new Scanner(System.in);

    //create instance variable for total
    private int x = 0;

    //allow a default constructor to exist without declaration

    //create a method to get the current total
    public int getTotal() { return x; }

    //create a method to ask the user for a number, then return that number
    public static int askUserForInput() {
        System.out.print("Enter a number: ");
        return in.nextInt();
    }

    //create a method to add an int to the total
    public void add(int x) {
        this.x += x;
    }

    //create method to print the total
    public void printTotal() {
        System.out.printf("The total is %d", x);
    }
}
