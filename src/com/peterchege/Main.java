package com.peterchege;

import com.peterchege.ooplessons.Employee;
import com.peterchege.ooplessons.TextBox;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        var textbox1 = new TextBox();
        textbox1.setText("Peter chege");
        System.out.println(textbox1.text.toUpperCase(Locale.ROOT));

        var textbox2 = new TextBox();
        textbox2.setText("Phylis Muthoni");
        System.out.println(textbox2.text.toUpperCase(Locale.ROOT));

        var employee = new Employee();
        employee.baseSalary = 50_000;
        employee.hourlyRate = 20;

        int wages = employee.calculateWage(34);
        System.out.println(wages);

    }
}
