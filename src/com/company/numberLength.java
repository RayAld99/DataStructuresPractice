package com.company;

import java.util.Scanner;

// Write a java program that asks user to enter an integer and you have to return the length of that integer.
// For example, if user enters 1234 then output would be 4
public class numberLength {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt();

        int count = 0;
        while(num > 0){
            num = num / 10;
            count++;

        }
        System.out.println("Count is: " + count);
    }

}
