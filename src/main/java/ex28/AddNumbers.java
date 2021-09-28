package ex28;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */
public class AddNumbers

{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double sum =0;
        double[] array =  new double[5];
        for(int k = 0;k<5;k++)
        {
            System.out.print("Enter a number: ");
            array[k]=input.nextDouble();
        }
        findSum(array,sum);

        System.out.printf("The total is %.2f",findSum(array,sum));


    }
    public static double findSum(double [] array, double sum)
    {
        for(int i = 0;i<5;i++)
        {
            sum+=array[i];
        }
        return sum;
    }
}
