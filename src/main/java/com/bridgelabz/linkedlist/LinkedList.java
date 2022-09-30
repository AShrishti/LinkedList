package com.bridgelabz.linkedlist;

class LinkedList {
	Node head; // head of list

	class Node {
		int data;
		Node next;

		// Constructor to create a new node
		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void push(int new_data) { // add node at front
		/* Inserts a new Node at front of the list. */

		Node new_node = new Node(new_data);

		// next of new Node as head */
		new_node.next = head;

		// the head to point to new Node */
		head = new_node;
	}

	public void insertAfter(Node prev_node, int new_data) {
		/* Inserts a new node after the given prev_node. */

		if (prev_node == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}

		Node new_node = new Node(new_data);

		// Make next of new Node as next of prev_node */
		new_node.next = prev_node.next;

		// make next of prev_node as new_node */
		prev_node.next = new_node;
	}

	public void append(int new_data) {
		// apend at the end

		Node new_node = new Node(new_data);

		// If the Linked List is empty, then make the new node as head */
		if (head == null) {
			head = new Node(new_data);
			return;
		}

		// This new node is going to be the last node, so make next of it as null */
		new_node.next = null;

		// Else traverse till the last node */
		Node last = head;
		while (last.next != null)
			last = last.next;

		// Change the next of last node */
		last.next = new_node;
		return;
	}

	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}

	public static void main(String[] args) {
		/* Start with the empty list */
		LinkedList llist = new LinkedList();

		/*
		 * // Insert 70. So linked list becomes 70->NUll llist.push(70); llist.push(30);
		 * llist.push(56);
		 */
		
		llist.append(56);
		llist.append(30);
		llist.append(70);
		
		
		 System.out.println("Created Linked Output is: ");
	        llist.printList();

	}
}
