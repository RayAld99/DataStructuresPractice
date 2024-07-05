package com.company;

import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the nmber of elements: ");
        int num = scanner.nextInt();

        int[] arr = new int[num];

        System.out.println("Enter the elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        int evenCount = even(arr);
        System.out.println("Even numbers are: " + evenCount);

        odd(arr);
    }

    public static int even(int [] arr){
        int count = 0;
        for(int element : arr){
            if(element % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static void odd(int[ ] arr){
        int count = 0;
        for(int element : arr){
            if(element % 2 !=0){
                count++;
            }
        }
        System.out.println("Odd numbers are: " + count);
    }
}
