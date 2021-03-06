package com.company;

import java.util.Scanner;

public class InsertionSortTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of array: ");
        int size = scanner.nextInt();
        System.out.println("Please enter the elements of array: ");
        int[] array = new int[size];
        for(int i=0; i<size; i++){
            array[i] = scanner.nextInt();
        }
        InsertionSort(array);
        System.out.println("The sorted array is: ");
        for(int x:array){
            System.out.print(x + " ");
        }
    }
    public static void InsertionSort(int[] array){
        int temp;
        for(int i=1; i< array.length; i++){
            for(int j=0; j<i; j++){
                if(array[i]<array[j]){
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

}
