package ex33;
import java.util.Scanner;


/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */
public class Magic8
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What's your question? ");
        String answer = input.nextLine();

        RandomPhrase Magic8Ball = new RandomPhrase();
        System.out.print(Magic8Ball.generatePhrase());
    }

}

