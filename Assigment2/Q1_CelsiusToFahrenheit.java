package Assigment2;

import java.util.Scanner;
// 1. Write a program to convert Celsius to Fahrenheit using appropriate datatypes and literal conventions
public class Q1_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Celsius : ");
        double celsius = sc.nextDouble();
        double celsiusToFahrenheit=celsius*9/5+32;
        System.out.printf("Fahrenheit : %.2f",celsiusToFahrenheit);
    }
}
