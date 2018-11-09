package com.company;

public class LinkedList {
    private Node head;
    private Node tail;
    private Node anyNode;

    public  LinkedList(String context){
        head = new Node(context);
        tail = head;
    }

    public void addToFront(String context ) { //the context of the node
        Node node = new Node(context);
        node.setNext(head);
        head.setPrevious(node);
        head = node;
    }

    public void addAtTheEnd(String context){
        Node node = new Node(context);
        tail.setNext(node);
        node.setPrevious(tail);
        tail = node;

    }

    public void addInTheMiddle(String context, String previousContext){
        Node node = new Node(context);
        Node current = head;
        while (current!= null) { //find the previous node
            if(current.getContext()==previousContext){
                anyNode = current;
            }
            current= current.getNext();
        }
        anyNode.getNext().setPrevious(node); //build links
        node.setNext(anyNode.getNext());
        node.setPrevious(anyNode);
        anyNode.setNext(node);
    }

    public void removeTheHead(){
        head=head.getNext();
    }

    public void removeTheTail(){
        tail.getPrevious().setNext(null);
        tail= tail.getPrevious();
    }

    public void removeAnyNode(String context){
        Node current = head;
        while (current!= null) { //find the node that is going to be deleted
            if(current.getContext()==context){
                anyNode = current;
            }
            current= current.getNext();
        }
        anyNode.getPrevious().setNext(anyNode.getNext());
    }

    public void printList() {
        Node current = head;
        while (current!= null) {
            System.out.println(current.getContext());
            current= current.getNext();
        }
    }
}