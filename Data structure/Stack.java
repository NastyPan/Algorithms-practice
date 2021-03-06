package com.company;

public class Stack {
    private String[] stack;
    int index = 0;

    public Stack(int size){
        stack = new String[size];
    }

    public void push(String string){
        if(index == stack.length){
            String[] newArray = new String[stack.length+1];
            for(int i=0; i<stack.length; i++){
                newArray[i] = stack[i];
                newArray[index] = string;
            }
            stack = newArray;
        }
        stack[index] = string;
        index++;
    }

    public void pop(){
        if(index ==0){
            System.out.println("Stack is empty");
        } else{
            stack[index-1] = null;
            index = index-1;
        }
    }

    public void printStack(){
        for(int i=0; i<stack.length; i++){
            System.out.println(stack[i]);
        }
    }
}
