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

	void push_at(int position, int newElement) {
		Node newNode = new Node(newElement);
		newNode.data = newElement;
		newNode.next = null;

		if (position < 1) {
			System.out.print("\nposition should be >= 1.");
		} else if (position == 1) {
			newNode.next = head;
			head = newNode;
		} else {

			Node temp = new Node(newElement);
			temp = head;
			for (int i = 1; i < position - 1; i++) {
				if (temp != null) {
					temp = temp.next;
				}
			}

			if (temp != null) {
				newNode.next = temp.next;
				temp.next = newNode;
			} else {
				System.out.print("\nThe previous node is null.");
			}
		}
	}

	// searchNode() will search for a given node in the list
	public int searchNode(int data) {
		Node current = head;
		int i = 1;
		boolean flag = false;
		// Checks whether list is empty
		if (head == null) {
			System.out.println("List is empty");
		} else {
			while (current != null) {
				// Compares with each node present in the list
				if (current.data == data) {
					flag = true;
					break;
				}
				i++;
				current = current.next;
			}
		}
		if (flag)
			System.out.println("Element is present in the list at the position : " + i);
		else
			System.out.println("Element is not present in the list");
		return i;
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

		/*
		 * llist.append(56); llist.append(30); llist.append(70);
		 */
		llist.push(56);// adding element at front
		llist.append(70);// adding element at end
		llist.push_at(llist.searchNode(56) + 1, 8); // add element at particular position

		System.out.println("Created Linked Output is: ");
		llist.printList();

	}
}
