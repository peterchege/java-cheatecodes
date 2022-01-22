package com.peterchege.javaLessons;

import java.awt.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        byte age = 30;
        Date now = new Date();
        now.getTime();
        Point point1 = new Point (1,2);
        Point point2 = point1;
        point1.x = 5;
        String message = "  Hello Peter \"Chege\"   ";
        System.out.println(message.startsWith("Hello"));
        System.out.println(message.endsWith("Chege"));
        System.out.println(message.length());
        System.out.println(message.indexOf("C"));
        System.out.println(message.trim());
        System.out.println(message.replace("Chege","Kinuthia").trim());
        System.out.println(message);

        String path = "c:\\windows\\user\\peterchege\\..";
        String newPath = "c:\t\\windows\\user\\peterchege\\..";
        System.out.println(path);
        System.out.println(newPath);

        String header = "My name is : \n peter chege kinuthia";
        System.out.println(header);

    }
}
