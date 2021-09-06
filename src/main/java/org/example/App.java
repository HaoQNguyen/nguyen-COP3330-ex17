/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hao Nguyen
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        final double rM = 0.73;
        final double rW = 0.66;
        final double LEGAL_BAC = 0.08;

        Scanner input = new Scanner(System.in);
        double r;

        System.out.print("Enter 1 if you are male or a 2 if you are female: ");
        int gender = input.nextInt();
        r = gender == 1 ? rM : rW;

        System.out.print("How many ounces of alcohol did you have? ");
        double A = input.nextDouble();

        System.out.print("What is your weight, in pounds? ");
        double W = input.nextDouble();

        System.out.print("How many hours has it been since your last drink? ");
        int H = input.nextInt();

        double BAC = (A * 5.14 / W * r) - 0.015 * H;
        System.out.printf("\nYour BAC is %f\n", BAC);
        if (BAC >= LEGAL_BAC)
        {
            System.out.println("It is not legal for you to drive.");
        }
        else
        {
            System.out.println("It is legal for you to drive.");
        }
    }
}
