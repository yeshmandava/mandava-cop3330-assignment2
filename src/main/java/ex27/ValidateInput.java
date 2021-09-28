package ex27;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */
public class ValidateInput
{
    public static boolean checkFirstName(String FirstName)
    {
        return FirstName.length() >= 2;
    }

    public static boolean checkLastName(String LastName)
    {
        return LastName.length() >= 2;
    }

    public static boolean checkZipCode(String ZipCode)
    {
        if(ZipCode.length() != 5)
        {
            return false;
        }
        for(int i = 0; i<5; i++)
        {
            if(!Character.isDigit(ZipCode.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
    public static boolean checkEmployeeID(String employeeID)
    {
        if(employeeID.length()!=7)
        {
            return false;
        }
        return Pattern.matches("[a-zA-Z]{2}[-][0-9]{4}", employeeID);
    }
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();
        System.out.print("Enter your ZIP code: ");
        String zipCode = input.nextLine();
        System.out.print("Enter your employee ID: ");
        String employeeId = input.nextLine();

        validateInput(firstName,lastName,zipCode,employeeId);


    }

    private static void validateInput(String FirstName, String LastName, String ZipCode, String employeeID)
    {
        int errorMessage = 0;
        if(!checkFirstName(FirstName))
        {
            errorMessage++;
            System.out.printf("%s is not a valid first name. It is too short.\n",FirstName);
        }
        if(!checkLastName(LastName))
        {
            errorMessage++;
            System.out.printf("%s is not a valid last name. It is too short.\n",LastName);
        }
        if(!checkZipCode(ZipCode))
        {
            errorMessage++;
            System.out.print("The ZIP code must consist of 5 numeric numbers.\n");
        }
        if(!checkEmployeeID(employeeID))
        {
            errorMessage++;
            System.out.printf("%s is not a valid employee ID.\n",employeeID);
        }
        if(errorMessage==0)
        {
            System.out.print("No errors were found");
        }
        else{
            System.out.printf("There is %d error(s).", errorMessage);
        }
    }
}
