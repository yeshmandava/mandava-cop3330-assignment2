package ex29;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */
public class BadInput
{
    public static void main(String[] args)
    {
        double rate = checkInput();
        double Years = calcRate(rate);
        System.out.printf("It will take %.0f years to double your initial investment", Years);

    }

    private static double checkInput()

    {
        Scanner input = new Scanner(System.in);
        boolean numIn=false;
        double num = 0;

        while(!numIn) {
            try {
                System.out.print("What is the rate of return? ");
                num = Double.parseDouble(input.next());
                if (num != 0) {
                    numIn = true;
                }else{
                    System.out.println("Sorry. That's not a valid input.");
                }
            } catch (Exception e) {
                System.out.println("Sorry. That's not a valid input.");
            }

        }
        return num;
    }

    public static double calcRate(double num)
    {
        return 72/num;
    }
}
