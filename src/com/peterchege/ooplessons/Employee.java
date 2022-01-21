package com.peterchege.ooplessons;

public class Employee {
    public int baseSalary;
    public int hourlyRate;

    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate* extraHours);
    }
}
