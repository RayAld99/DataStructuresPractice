package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of element: ");
        int num = scanner.nextInt();

        int[] array = new int[num];

        System.out.println("Enter elements: ");
        for(int i= 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }


        reverseArray(array);

        System.out.println("The reversed array: ");
        System.out.println("This is by normal for loop ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("This is by for each/enhanced loop ");
        for(int elements : array){
            System.out.print(elements + " ");
        }
        System.out.println();

        System.out.println("This is by toString method");
        System.out.println(Arrays.toString(array));

    }

    public static void reverseArray(int [] array){
        int i = 0;
        int j = array.length -1;
        int temp;

        while(i < j){
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;

            i++;
            j--;
        }
    }
}
