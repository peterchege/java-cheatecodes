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

//        var control = new UIControl(true);
//        var textBox = new TextBox();
//        show(textBox);

//        var point1 = new Point(1,2);
//        var point2 = new Point(1,2);
//        System.out.println(point1.equals(point2) );
//        System.out.println(point1.hashCode() );
//        System.out.println(point2.hashCode() );

        UIControl[] controls = {new TextBox(), new CheckBox()};
        for (var control:controls)
            control.render();
    }

    private static void show(UIControl control) {
        if( control instanceof TextBox){
            var textBox = (TextBox)control;
            textBox.setText("Hello world");
        }

        System.out.println(control);
    }


}
