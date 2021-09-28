package ex26;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */
public class CreditCard
{
    public static double calculateMonthsUntilPaidOff(double i, double b, double p)
    {
        return Math.ceil((-1/30f)*Math.log(1+(b/p)*(1-Math.pow((1+i),30)))/Math.log(1+i));
    }
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your balance: ");
        double Balance = input.nextDouble();
        System.out.print("What is the APR on the card (as a percentage): ");
        double APR = input.nextDouble();
        System.out.print("What is the monthly payment you can make: ");
        double Payment = input.nextDouble();

        double Rate = (APR/100)/365;

        double numMonths = calculateMonthsUntilPaidOff(Rate,Balance,Payment);

        System.out.printf("It will take you %.0f months to pay off this card.", numMonths);
    }


}
