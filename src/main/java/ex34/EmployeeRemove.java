package ex34;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */
public class EmployeeRemove
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        EmployeeList TotalEmployees = new EmployeeList();

        System.out.print(TotalEmployees.printEmployee());

        System.out.print("Enter an employee name to remove: ");
        String removeName = input.nextLine();
        TotalEmployees.removeEmployee(removeName);
        System.out.print(TotalEmployees.printEmployee());


    }
}
