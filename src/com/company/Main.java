package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        double num1 = sc.nextDouble();
        System.out.println("Enter your second number");
        double num2 = sc.nextDouble();
        System.out.println("Enter your third number");
        double num3 = sc.nextDouble();
        double largest;
        double lowest;
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }
        if (num1 <= num2 && num1 <= num3) {
            lowest = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            lowest = num2;
        } else {
            lowest = num3;
        }
        System.out.println("The largest number is " + largest);
        System.out.println("Largest Number is " + largest + "\nLowest number is " + lowest);
    }
}
