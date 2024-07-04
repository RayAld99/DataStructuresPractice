package com.company;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //ask user to enter the number of elements in the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // the array of integers with the given number of elements
        int[] array = new int[n];
        System.out.print("Enter elements: ");

        // the elements of the array from the user input
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = calculateSum(array);
        System.out.println("Sum of array elements: " + sum);
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
