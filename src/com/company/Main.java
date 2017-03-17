package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    double celcius, fahrenheit;

    double minutes, years, days;

    int age;
    Scanner sc=new Scanner(System.in);

    fahrenheit = 40.0;
    celcius = FahrenheitConv(fahrenheit);
    System.out.println(fahrenheit+" degrees fahrenheit is equal to " + String.format("%.2f", celcius) + " celcius");

    minutes = 4000000.00;
    days = MinToDays(minutes);
    years = MinToYears(minutes);
    System.out.println("There are " + String.format("%.2f", days) + " days" + " in " + minutes + " minutes");
    System.out.println("There are " + String.format("%.2f", years) + " years in " + minutes + " minutes");

    System.out.println("Please enter your age: ");
    age=sc.nextInt();
    VotingAge(age);

	// write your code here
    }

    private static void VotingAge(int age) {
        if (age>=18)
            System.out.println("Person is eligible to vote");
        else
            System.out.println("Person underage and not eligible to vote");

    }


    private static double MinToYears(double minutes) {
        return minutes/525600;
    }

    private static double MinToDays(double minutes) {
        return minutes/1440;
    }

    private static double FahrenheitConv(double v) {

        return (v*1.8+32);
    }


}
