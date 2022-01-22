package com.peterchege.ooplessons;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees; // static field

    public Employee(int baseSalary){
       this(baseSalary, 0); // overloading a constructor
    }
    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public static void printNumberOfEmployees(){
        System.out.println(numberOfEmployees); // static method
    }

    public int calculateWage(int extraHours){
        return baseSalary + (getHourlyRate() * extraHours);
    }
    public int calculateWage(){
        return calculateWage(0); //overloading a method
    }

    private void setBaseSalary(int baseSalary){
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        this.baseSalary = baseSalary; // setters with abstraction
    }
    private int getBaseSalary(){
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate; //getters with abstraction
    }
    private void setHourlyRate(int hourlyRate) {
        if(hourlyRate < 0)
             throw new IllegalArgumentException("Hourly rate cannot be 0");
        this.hourlyRate = hourlyRate;
    }
}
