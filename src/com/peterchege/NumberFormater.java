package com.peterchege;

import java.text.NumberFormat;

public class NumberFormater {
    public static void main(String[] args){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format( 12456335.8990);
        System.out.println(result);
        NumberFormat percentValue = NumberFormat.getPercentInstance();
        String result2 = percentValue.format(.05);
        System.out.println(result2);


    }
}
