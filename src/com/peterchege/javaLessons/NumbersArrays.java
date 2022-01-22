package com.peterchege.javaLessons;

import java.util.Arrays;

public class NumbersArrays {
    public static void main(String[] args){
        int[] numbers = { 1, 3, 5, 6, 7, 2 };
        Arrays.sort(numbers);
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));

    }

}
