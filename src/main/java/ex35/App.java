package ex35;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */
public class App {
    public static void main(String[] args) {
        PickWinner contestWinner = new PickWinner();
        contestWinner.inputNames();
        System.out.print("The winner is ... " + contestWinner.winner() + "!");
    }
}
