package com.company;

import java.util.Scanner;

public class BinarySearchTest {

    public static void main(String[] args) {
	    int[] array = {1,23,35,42,56,77,78,85,87,92,99,103,134};
        System.out.println("Please enter the integer you want to search: ");
        Scanner scanner = new Scanner(System.in);
        int intSearch = scanner.nextInt();
        BinarySearch(array,intSearch);
    }

    public static boolean BinarySearch(int[] array,int number){
        int low = 0;
        int high = array.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(array[mid]==number){
                System.out.println("The number found in index "+ mid+"th of array.");
                return true;
            }else if(array[mid]>number){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        System.out.println("Sorry, the number is not in the array.");
        return false;
    }
}
