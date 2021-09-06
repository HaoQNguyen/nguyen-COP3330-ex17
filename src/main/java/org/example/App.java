/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hao Nguyen
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    public static void main( String[] args )
    {
        final double rM = 0.73;
        final double rW = 0.66;
        final double LEGAL_BAC = 0.08;

        Scanner input = new Scanner(System.in);
        double r;
        int gender;
        double A;
        double W;
        double H;

        while (true) {
            System.out.print("Enter 1 if you are male or a 2 if you are female: ");
            String in = input.nextLine();
            if (isNumeric(in)) {
                gender = Integer.parseInt(in);
                r = gender == 1 ? rM : rW;
                break;
            } else {
                System.out.println("Please only enter numeric value!");
            }
        }

        while (true) {
            System.out.print("How many ounces of alcohol did you have? ");
            String in = input.nextLine();
            if (isNumeric(in)) {
                A = Double.parseDouble(in);
                break;
            } else {
                System.out.println("Please only enter numeric value!");
            }
        }

        while (true) {
            System.out.print("What is your weight, in pounds? ");
            String in = input.nextLine();
            if (isNumeric(in)) {
                W = Double.parseDouble(in);
                break;
            } else {
                System.out.println("Please only enter numeric value!");
            }
        }

        while (true) {
            System.out.print("How many hours has it been since your last drink? ");
            String in = input.nextLine();
            if (isNumeric(in)) {
                H = Double.parseDouble(in);
                break;
            } else {
                System.out.println("Please only enter numeric value!");
            }
        }

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
