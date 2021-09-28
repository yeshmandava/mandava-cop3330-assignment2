package ex32;
import java.util.Scanner;


/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */
public class NumberGuess
{
    public static void main( String[] args )
    {
        NumberGuesser();

    }

    public static boolean NumberGuesser()
    {
        Scanner input = new Scanner(System.in);

        while (true)
        {
            int numGuesses = 0;
            System.out.print("Let's play Guess the Number!\nPick a difficulty level (1, 2, 3): ");
            int level = input.nextInt();
            int ChosenNum = RandomNum(level);

            System.out.print("I have my number. What's your guess? ");
            int guess = input.nextInt();
            numGuesses++;

            while(ChosenNum != guess)
            {
                if(guess>ChosenNum)
                {
                    System.out.print("Too high. Guess Again: ");
                }
                else
                {
                    System.out.print("Too low. Guess Again: ");
                }
                guess = input.nextInt();
                numGuesses++;
            }

            System.out.printf("You got in %d guesses. ", numGuesses);
            System.out.print("Would you like to play again? (y/n): ");
            String Repeat = input.next();

            if(Repeat.equalsIgnoreCase("n"))
            {
                System.out.print("Goodbye!");
                return false;
            }

        }
    }


    public static int RandomNum(int level)
    {
        if(level == 1)
        {
            return (int) (Math.random() *10 + 1);
        }
        else if(level ==2)
        {
            return(int) (Math.random()*100 + 1);
        }
        else
        {
            return (int) (Math.random() *1000 + 1);
        }
    }

}
