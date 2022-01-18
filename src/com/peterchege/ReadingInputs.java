package com.peterchege;

import java.util.Scanner;

public class ReadingInputs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Age: ");
//        byte age = scanner.nextByte();
//        System.out.println("Your age is:" + age);
        System.out.print("firstName:");
        String name = scanner.nextLine().trim();
        System.out.println("Your name is:" + name);
    }
}
