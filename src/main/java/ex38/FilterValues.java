package ex38;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */
public class FilterValues
{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String input=in.nextLine();

        int numsArray[]=initArray(input);

        FindEvens filterEvens=new FindEvens();
        numsArray=filterEvens.findEvens(numsArray);

        System.out.print("The even numbers are: ");
        formArray (numsArray);
        System.out.print(".");

    }

    private static void formArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(" "+array[i]);
        }
    }

    public static int[] initArray(String input){
        int[] intArray=new int[(input.length()/2+1)];
        int p=0;
        for(int i=0;i<input.length();i++){
            if(i%2==0){
                intArray[p]=input.charAt(i)-'0';
                p++;
            }
        }
        return intArray;
    }

}