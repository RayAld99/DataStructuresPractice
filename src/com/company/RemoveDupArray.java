package com.company;

import java.util.Scanner;

import java.util.Scanner;

public class RemoveDupArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] uniqueArray = removeDuplicates(arr);

        System.out.print("Array after removing duplicates: ");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] removeDuplicates(int[] array) {
        int len = array.length;
        int j = 0;


        for (int i = 0; i < len - 1; i++) {
            if (array[i] != array[i + 1]) {
                array[j++] = array[i];
            }
        }

        array[j++] = array[len - 1];

        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = array[i];
        }

        return result;
    }
}
