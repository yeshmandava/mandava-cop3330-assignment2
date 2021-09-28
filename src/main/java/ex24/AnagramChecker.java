package ex24;
import java.util.Scanner;
import java.util.Arrays;


/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */

public class AnagramChecker
{
    public static boolean isAnagram(String word1, String word2)
    {
        if(word1.length() != word2.length())
        {
            return false;
        }
        char[] string1 = word1.toCharArray();
        char[] string2 = word2.toCharArray();

        Arrays.sort(string1);
        Arrays.sort(string2);

        return Arrays.equals(string1, string2);

    }
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two strings and I'll tell you if they are anagrams:\n Enter the first string: ");
        String Str1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String Str2 = input.nextLine();

        if(isAnagram(Str1, Str2))
        {
            System.out.printf("\"%s\" and \"%s\" are anagrams.", Str1, Str2);
        }
        else
        {
            System.out.printf("Sorry the words \"%s\" and \"%s\" are not anagrams.", Str1, Str2);
        }
    }
}
