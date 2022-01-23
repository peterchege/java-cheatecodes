package com.peterchege.ooplessons;

public class Main {

    public static void main(String[] args) {
//        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
//        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
//        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);
//
//        var calculator = new MorgageCalculator(principal, annualInterest, years);
//
//        var report = new MorgageReport(calculator);
//        report.printMortgage();
//        report.printPaymentSchedule();

//        var control = new TextBox();
//        control.disabled();
//        System.out.println(control.isEnabled());

//        var textBox = new TextBox();
//        textBox.setText("peter chege");
//        System.out.println(textBox);

        var control = new UIControl(true);
        var textBox = new TextBox();
        show(textBox);
    }

    private static void show(UIControl control) {
        var textBox = (TextBox)control;
        textBox.setText("Hello world");
        System.out.println(control);
    }


}
