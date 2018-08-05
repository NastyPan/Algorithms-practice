package com.company;

import java.util.Scanner;

public class BubbleSortTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of array: ");
        int size = scanner.nextInt();
        System.out.println("Please enter the elements of array: ");
        int[] array = new int[size];
        for(int i=0; i<size; i++){
            array[i] = scanner.nextInt();
        }
        BubbleSort(array);
        System.out.println("The sorted array is: ");
        for(int x:array){
            System.out.print(x + " ");
        }
    }
    public static void BubbleSort(int[] array){
        int temp;
        for(int i=0; i< array.length-1; i++){
            for(int j=0; j<array.length-1-i; j++){
                if(array[j]>array[j+1]){
                    temp=array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
