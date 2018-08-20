package com.company;

public class Queue {
    private String[] queueArray;
    private int front=0;
    private int back=0;

    public Queue(int size){
        queueArray = new String[size];
    }

    public void add(String string) {
        if (back == queueArray.length) {
            String[] newArray = new String[queueArray.length + 1];
            for (int i = 0; i < queueArray.length; i++) {
                newArray[i] = queueArray[i];
            }
            newArray[back] = string;
            queueArray = newArray;
            back++;
        } else {
            queueArray[back] = string;
            back++;
        }
    }

    public void remove() {
        if (queueArray.length==0) {
            System.out.println("The queue is empty. Can't remove");
        } else {
            String[] newArray = new String[queueArray.length - 1];
            for (int i = 0; i < queueArray.length - 1; i++) {
                newArray[i] = queueArray[i + 1];
            }
            queueArray = newArray;
        }
    }

    public void printQueue() {
        for (int i = 0; i < queueArray.length; i++) {
            System.out.println(queueArray[i]);
        }
    }
}
