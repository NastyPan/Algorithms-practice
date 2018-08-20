package com.company;

public class LinearSearch {

    public static void main(String[] args) {
        String[] city = {"New York","Los Angels","Boston","Chicago",
                "Cleveland","Denver","Golden States"};

        search(city,"New York");
    }

    public static void search(String[] stringArray, String cityName){
        for(int i=0; i<stringArray.length; i++){
            if(stringArray[i]==cityName){
                System.out.println(cityName+" is in the array.");
                break;
            }
            if(i==stringArray.length-1 && stringArray[i]!=cityName){
                System.out.println(cityName+" is not in the array.");
                break;
            }
        }

    }
}
