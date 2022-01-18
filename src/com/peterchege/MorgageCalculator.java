package com.peterchege;

import java.text.NumberFormat;
import java.util.Scanner;

public class MorgageCalculator {
    public static void main(String[] args){
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal:");
        int principal = scanner.nextInt();

        System.out.print("Enter Annual Interest Rate:");
        float rate = scanner.nextFloat();
        double monthlyIntrest = rate/PERCENT/MONTH_IN_YEAR;

        System.out.print("Period of years:");
        byte years = scanner.nextByte();

        int numberOfPayments = years * MONTH_IN_YEAR;

        double firstBrackets = 1 + monthlyIntrest;
        double squareValue = Math.pow(firstBrackets, numberOfPayments);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        double result = principal * ((monthlyIntrest * squareValue)/(squareValue - 1));
        String mortgage = currency.format(result);
        System.out.println("Your Mortgage is: " + mortgage);


    }
}
