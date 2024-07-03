package com.company;

import java.util.Scanner;

// write a java program that prompts user to enter two integers and it returns the sum of them
public class AddIntegerProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter first integer:");

        int int1 = sc.nextInt();

        System.out.println("Enter second integer");

        int int2 = sc.nextInt();

        int sum = int1 + int2;

        System.out.println("The sum of two integers: " + sum);
    }
}
