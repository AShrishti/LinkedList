package com.bridgelabz.linkedlist;

import com.bridgelabz.linkedlist.LinkedList.Node;

class StackUsingLinkedlist {
	 
    // A linked list node
    private class Node {
 
        int data; // integer data
        Node link; // reference variable Node type
    }
    // create global top reference variable global
    Node top;
    // Constructor
    StackUsingLinkedlist() { this.top = null; }
 
    // Utility function to add an element x in the stack
    public void push(int new_data) // insert at the beginning
    {
        // create new node temp and allocate memory
        Node temp = new Node();
 
       
 
        // initialize data into temp data field
        temp.data = new_data;
 
        // put top reference into temp link
        temp.link = top;
 
        // update top reference
        top = temp;
    }
 
    // Utility function to check if the stack is empty or
    // not
    public boolean isEmpty() { return top == null; }
 
    // Utility function to return top element in a stack
    public int peak()
    {
        // check for empty stack
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
 
    // Utility function to pop top element from the stack
    public void pop() // remove at the beginning
    {
        // check for stack underflow
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }
 
        // update the top pointer to point to the next node
        top = (top).link;
    }
    
    public void display()
    {
        // check for stack underflow
        if (top == null) {
            System.out.printf("\nStack Underflow");
            return;
        }
        else {
            Node temp = top;
            while (temp != null) {
 
                // print node data
                System.out.printf("%d->", temp.data);
 
                // assign temp link to temp
                temp = temp.link;
            }
        }
    }
}


public class Stack {

	

	public static void main(String[] args) {
		StackUsingLinkedlist stack = new StackUsingLinkedlist();  //LIFO
		stack.push(70);			//	UC1
		stack.push(30);
		stack.push(56);
		stack.display();
		
		stack.peak();			//UC2
		stack.pop();
		System.out.println("Stack after peek and pop operation");
		stack.display();
		
		System.out.println("\ntop element is : "+stack.peak());
		stack.pop();
		System.out.println("Stack after peek and pop operation");
		stack.display();
		
		stack.peak();
		System.out.println("Stack after peek and pop operation");
		stack.pop();
		
		stack.display();
	

	}
}
