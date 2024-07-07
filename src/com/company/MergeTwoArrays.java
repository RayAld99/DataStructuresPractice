package com.company;

import java.util.Scanner;

public class MergeTwoArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of elements in the first array: ");
        int n1 = scanner.nextInt();

        int[] arr1 = new int[n1];

        System.out.print("Enter elements: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }


        System.out.print("Enter the number of elements in the second array: ");

        int n2 = scanner.nextInt();

        int[] arr2 = new int[n2];

        System.out.print("Enter elements: ");

        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }


        int[] mergedArray = mergeArrays(arr1, arr2);


        System.out.print("Merged array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {

        int length1 = array1.length;
        int length2 = array2.length;

        int[] mergedArray = new int[length1 + length2];


        for (int i = 0; i < length1; i++) {
            mergedArray[i] = array1[i];
        }


        for (int i = 0; i < length2; i++) {
            mergedArray[length1 + i] = array2[i];
        }

        return mergedArray;
    }
}
