package ex37;
import java.util.Scanner;


/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */
public class App
{
    public static void main(String[] args){
        int Length=getValidInputNumber("What's the minimum length? ");
        int numSpecials=getValidInputNumber("How many special characters? ");
        int numDigits=getValidInputNumber("How many numbers? ");

        int amtOfLetters=calculateAmtOfLetters(Length,numSpecials,numDigits);

        CreatePassword passwordGenerator=new CreatePassword();
        String password=passwordGenerator.formPassword(numSpecials,numDigits,amtOfLetters);
        System.out.println("Your Password is "+ password);
    }
    public static int calculateAmtOfLetters(int Length,int numSpecials,int numDigits){
        int totalAdded=numDigits+numSpecials;
        if(Length<=2*totalAdded){
            return totalAdded;
        }else{
            return (totalAdded)+(Length-totalAdded);
        }
    }

    private static int getValidInputNumber(String question){
        Scanner in=new Scanner(System.in);
        String strNum="";
        int Num=-1;
        while(Num<0) {
            try {
                System.out.print(question);
                Num = Integer.parseInt(in.next());
            } catch (NumberFormatException ex) {
                System.out.println("Input number please.");
            }
        }
        return Num;
    }
}

