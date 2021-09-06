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
        int gender;
        double A;
        double W;
        int H;

        while (true) {
            try {
                System.out.print("Enter 1 if you are male or a 2 if you are female: ");
                gender = Integer.parseInt(input.nextLine());
                r = gender == 1 ? rM : rW;
            } catch (NumberFormatException e) {
                System.out.println("Please only enter numeric value!");
                continue;
            }
            break;
        }

        while (true) {
            try {
                System.out.print("How many ounces of alcohol did you have? ");
                A = Double.parseDouble(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please only enter numeric value!");
                continue;
            }
            break;
        }

        while (true) {
            try {
                System.out.print("What is your weight, in pounds? ");
                W = Double.parseDouble(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please only enter numeric value!");
                continue;
            }
            break;
        }

        while (true) {
            try {
                System.out.print("How many hours has it been since your last drink? ");
                H = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please only enter numeric value!");
                continue;
            }
            break;
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
