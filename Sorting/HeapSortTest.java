package com.company;

import java.util.Scanner;

public class HeapSortTest {

    private static int[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of array: ");
        int size = scanner.nextInt();
        System.out.println("Please enter the elements of array: ");
        int[] array = new int[size];
        for(int i=0; i<size; i++){
            array[i] = scanner.nextInt();
        }
        HeapSort(array);
        System.out.println("The sorted array is: ");
        for(int x:array){
            System.out.print(x + " ");
        }
    }

    public static void HeapSort(int[] array){
        int size = array.length;
        BuildMaxHeap(array);
        for(int i=size-1; i>=1; i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            MaxHeapify(array,i,0);
        }
    }

    public static void BuildMaxHeap(int[] array){
        int n = array.length;
        for(int i=(array.length)/2-1; i>=0; i--){
            MaxHeapify(array,n,i);
        }
    }

    public static void MaxHeapify(int[] array, int n ,int i){
        int largest=i;
        int L = 2*i+1;
        int R = 2*i+2;
        if(L<=n-1 && array[L]>array[largest]){
            largest = L;
        }else{
            largest = i;
        }
        if(R<=n-1 && array[R]>array[largest]){
            largest = R;
        }
        if(largest!=i){
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            MaxHeapify(array,n,largest);
        }
    }
}
