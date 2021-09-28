package ex31;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */
public class HeartRate
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your age in numeric value: ");
        int Age = input.nextInt();
        System.out.print("Please enter your resting heart rate: ");
        int HR = input.nextInt();

        KarvonenTable(Age,HR);

    }
    public static int CalculateHR(int age, int hr, int intensity)
    {
        return (((220 - age) - hr) * intensity/100) + hr;
    }

    private static void KarvonenTable(int age, int hr)
    {
        System.out.print("Intensity     | Rate\n");
        System.out.print("______________|________\n");
        for(int i=55;i<=95;i+=5)
        {
            System.out.printf("%d%%           | %d bpm\n", i, CalculateHR(age,hr,i));
        }
    }

}
