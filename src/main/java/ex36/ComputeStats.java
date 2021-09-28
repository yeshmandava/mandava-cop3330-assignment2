package ex36;
import java.util.ArrayList;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */
public class ComputeStats
{
    private static ArrayList numbers = new ArrayList<Double>();
    public static void main( String[] args )
    {
        Calculations calculateStats = new Calculations();
        numberInput();
        System.out.print("Numbers: " + numbers.toString() + "\n");
        System.out.print("The average is " + calculateStats.Mean(numbers) + "\n");
        System.out.print("The minimum is " +calculateStats.Minimum(numbers) + "\n");
        System.out.print("The maximum is " +calculateStats.Maximum(numbers) +"\n");
        System.out.print("The standard deviation is " +calculateStats.StandardDev(numbers));

    }

    public static void numberInput()
    {
        Scanner input = new Scanner(System.in);
        String num = "";
        while(!num.equals("done"))
        {
            System.out.print("Enter a number: ");
            num = input.nextLine();

            if(num.equals("done"))
            {
                break;
            }

            try{
                numbers.add(Double.parseDouble(num));
            }catch(Exception ex) {
                System.out.print("Please enter a number or type done.");
            }

        }
    }

}
