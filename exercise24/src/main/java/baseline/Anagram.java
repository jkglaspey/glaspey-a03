package baseline;

import java.util.Scanner;
import java.util.Arrays;

public abstract class Anagram {

    //declare class Scanner variable
    private static final Scanner in = new Scanner(System.in);
    //declare static int i for counting total strings
    private static int i = 1;

    //create method to print an introduction
    public static void printIntro() {
        System.out.print("Enter two strings and I'll tell you if they are anagrams:\n");
    }

    //create method to read input
    public static String getStringFromUser() {
        //prompt for user to enter String #i, where i is a class variable for total iterations
        if(i == 1) {
            System.out.print("Enter the first string: ");
            i++;
        }
        else System.out.print("Enter the second string: ");

        //return user input
        return in.nextLine();
    }

    //create method to compare if Strings are anagrams
    public static boolean isAnagram(String a, String b) {

        //create 2 character arrays of each string
        char[] string1 = toCharArray(a);
        char[] string2 = toCharArray(b);

        //compare the two frequency arrays, and return the boolean result
        return compareArrays(string1,string2);
    }

    //create method to convert a string to a character array (while removing spaces)
    public static char[] toCharArray(String a) {

        //remove white space from string
        String temp = a.replaceAll("\\s+","");

        //declare a new character array
        char[] chars = new char[temp.length()];

        //assign values to the character array (and also convert letters to lower case)
        for(int i = 0; i < temp.length(); i++) {

            //assign character from string
            chars[i] = temp.charAt(i);

            //convert letters to lower case
            chars[i] = Character.toLowerCase(chars[i]);
        }
        //return the character array
        return chars;
    }

    //create method to compare two character arrays
    public static boolean compareArrays(char[] a, char[] b) {

        //sort each array
        Arrays.sort(a);
        Arrays.sort(b);

        //compare arrays and return result
        return Arrays.equals(a,b);
    }

    //create method to print results
    public static void printAnagram(boolean anagram, String a, String b) {

        //if boolean value is true, print that A and B are anagrams
        if(anagram) System.out.printf("\"%s\" and \"%s\" are anagrams.",a,b);

        //else print that A and B are not anagrams
        else System.out.printf("\"%s\" and \"%s\" are not anagrams.",a,b);
    }
}
