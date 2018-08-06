package com.company;

import java.util.Scanner;

public class MergeSortTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of array: ");
        int size = scanner.nextInt();
        System.out.println("Please enter the elements of array: ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        MergeSort(array,0,size-1);
        System.out.println("The sorted array is: ");
        for (int x : array) {
            System.out.print(x + " ");
        }
    }

    public static void MergeSort(int[] array, int p,int r){
        if(p<r){
            int q = (p+r)/2;
            MergeSort(array,p,q); //recursive
            MergeSort(array,q+1,r); //recursive
            merge(array,p,q,r);
        }
    }

    public static void merge(int[] array,int p,int q, int r) {
        int n1 = q - p + 1; //the size of left array
        int n2 = r - q; //the size of right array
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[p + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[q + 1 + j];
        }
        int i = 0, j = 0, k = p; //indexes
        //compare left and right array
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
                k++;
            } else {
                array[k] = rightArray[j];
                j++;
                k++;
            }
        }
        //if left array still has components, add it all to the array
        while (i < n1 && j == n2) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        //if right array still has components, add it all to the array
        while (j < n2 && i == n1) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
