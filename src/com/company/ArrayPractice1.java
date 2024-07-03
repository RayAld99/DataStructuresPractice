// write a method that takes integer array as an argument and return the smallest element from that.

package com.company;

public class ArrayPractice1 {
    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5};

        int answer = smallestElement(arr);

        System.out.println("The smallest element in the array is: " + answer);

    }

    public static int smallestElement(int []  arr){
        int smallest = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        return smallest;

    }

}
