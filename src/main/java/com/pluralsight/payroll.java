package com.pluralsight;

import java.util.Scanner;

public class payroll {
    public static void main(String[] args) {

        String name = userName();
        double hours = userHours();
        double payRate = userPayRate();
        double grossPay = pay(hours, payRate);

        // give user back gross pay
        System.out.printf("Hey, %s! Your gross pay is: $%.2f%n", name, grossPay);
    }

    // for user input
    public static String userName() {
        Scanner myScanner = new Scanner(System.in);

        // user input name
        System.out.println("Enter Name: ");
        String name = myScanner.nextLine();

        return name;
    }

    public static double userHours() {
        Scanner myScanner = new Scanner(System.in);

        // user input hours worked
        System.out.println("How many hours have you worked?");
        double hours = myScanner.nextDouble();

        return hours;
    }

    public static double userPayRate() {
        Scanner myScanner = new Scanner(System.in);

        // user input pay rate as a float
        System.out.println("What is your payrate?");
        float payRate = myScanner.nextFloat();

        return payRate;
    }

    // for calculating payroll
    public static double pay(double hours, double payRate) {
        // calculate gross pay
        double grossPay, overtime;

        // BONUS: if user is over 40 hrs add a 1.5x payrate for extra hours
        if(hours > 40){
            overtime = hours - 40;
            grossPay = hours * payRate + (overtime * (payRate * 1.5));
        }else{
            grossPay = hours * payRate;
        }

        // give user back gross pay
        return grossPay;
    }

}
