package baseline;

public class MultiplicationTable {

    //create instance variables for low and high value
    private final int low;
    private final int high;

    //create public constructor
    public MultiplicationTable(int low, int high) {
        this.low = low;
        this.high = high;
    }

    //create default constructor
    public MultiplicationTable() {
        this.low = 0;
        this.high = 0;
    }

    //create method to get the low value
    public int getLow() { return low; }

    //create method to get the high value
    public int getHigh() { return high; }

    //create method to print a table
    public void printTable() {

        //nest a loop
        //loop 1: from low to high
        //loop 2: from low to high
        //print: index 2 * index 1
    }
}
