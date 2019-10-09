package edu.cscc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number to square: ");
        int num = input.nextInt();

        SquareAndCount run1 = new SquareAndCount();

        System.out.println("The square of " + num + " is " + run1.square(num));

        System.out.print("Please enter a Word to count the letter A ");
        String wordToCount = input.next();

        SquareAndCount run2 = new SquareAndCount();

        System.out.println("The number of A's in the word " + wordToCount + " is " + run2.countA(wordToCount));
    }

}
