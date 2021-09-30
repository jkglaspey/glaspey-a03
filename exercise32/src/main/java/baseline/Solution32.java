/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

public class Solution32 extends RandomNumber{

    /*
    Write a Guess the Number game that has three levels of difficulty. The first level of difficulty would be a number
    between 1 and 10. The second difficulty set would be between 1 and 100. The third difficulty set would be between 1
    and 1000.
     */

    public static void main(String[] args) {

        //create a default RandomNumber object, so we can replace old values instead of creating infinitely many ones.
        RandomNumber randomNumber;

        //say the introduction
        sayIntroduction();

        //loop until user is finished
        do{
            //prompt user for difficulty
            int difficulty = askUserForDifficulty();

            //create a RandomNumber object
            randomNumber = new RandomNumber(difficulty);

            //call method to loop the guessing logic
            randomNumber.guessNumber();

        //determine if the user wishes to play again or not (also print the total guesses)
        } while(randomNumber.askUserToPlayAgain());
    }
}
