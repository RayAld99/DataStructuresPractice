package com.company;
//write a Java program with the help of a method that asks user to enter length and width of rectangle that returns its area.

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter length: ");
        int length = sc.nextInt();

        System.out.println("Enter width: ");
        int width = sc.nextInt();

        int area1 = area(length, width);
        System.out.println("Area of rectangle: " + area1);

    }

    public static int area(int length, int width){
        int result = length * width;
        return result;
    }
}
