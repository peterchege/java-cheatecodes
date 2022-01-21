package com.peterchege.javaLessons;

import java.text.NumberFormat;
import java.util.Scanner;

public class MorgageCalculator {
    public static void main(String[] args){
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        double monthlyIntrest = 0;
        int numberOfPayments = 0;

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Enter Principal:");
            principal = scanner.nextInt();
            if(principal >= 1_000 && principal <= 1_000_000)
                break;
                System.out.println("Enter a value between 1K to 1M");
        }


        while (true){
            System.out.print("Enter Annual Interest Rate:");
            float rate = scanner.nextFloat();
            if(rate >= 1 && rate <= 30){
                monthlyIntrest = rate/PERCENT/MONTH_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        while(true){
            System.out.print("Period of years:");
            byte years = scanner.nextByte();
            if(years >= 1 && years <= 30){
                numberOfPayments = years * MONTH_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }


        double firstBrackets = 1 + monthlyIntrest;
        double squareValue = Math.pow(firstBrackets, numberOfPayments);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        double result = principal * ((monthlyIntrest * squareValue)/(squareValue - 1));
        String mortgage = currency.format(result);
        System.out.println("Your Mortgage is: " + mortgage);


    }
}
