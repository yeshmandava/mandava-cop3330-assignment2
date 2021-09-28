package ex25;
import java.util.Scanner;


/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */

public class PasswordStrength
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = input.nextLine();

        PasswordValidator passwordValidator = new PasswordValidator();
        int passStrength = passwordValidator.PasswordStrength(password);

        if(passStrength==0){
            System.out.printf(" The password \"%s\" is a very weak password", password);
        }else if(passStrength==1){
            System.out.printf(" The password \"%s\" is a weak password", password);
        }else if(passStrength==2){
            System.out.printf(" The password \"%s\" is a strong password", password);
        }else{
            System.out.printf(" The password \"%s\" is a very strong password", password);
        }
    }
}
