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
			System.out.println("Element " + data + "  is present in the list at the position : " + i);
		else
			System.out.println("Element " + data + " is not present in the list");
		return i+1;
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

	void deleteNode(int data) {
		  Node temp = head, prev = null;
		  if (temp != null && temp.data == data) {
		    head = temp.next;
		    return;
		  }
		  while (temp != null && temp.data != data) {
		    prev = temp;
		    temp = temp.next;
		  }
		  if (temp == null)
		    return;
		 
		  prev.next = temp.next;
		}

	public Node removeFirstNode() { // pop
		if (head == null)
			return null;

		// Move the head pointer to the next node
		Node temp = head;
		head = head.next;

		return head;
	}



	public Node removeLastNode() // popLast
	{
		if (head == null)
			return null;

		if (head.next == null) {
			return null;
		}

		// Find the second last node
		Node second_last = head;
		while (second_last.next.next != null)
			second_last = second_last.next;

		// Change next of second last
		second_last.next = null;

		return head;
	}

	public int lengthOfLinkedList() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		System.out.println("\nsize of LinkedList is " + count);
		return count;
	}

	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}
	
	 public void sortList()
	    {
	 
	        // Node current will point to head
	        Node current = head, index = null;
	 
	        int temp;
	 
	        if (head == null) {
	            return;
	        }
	        else {
	            while (current != null) {
	                // Node index will point to node next to current
	                
	                index = current.next;
	 
	                while (index != null) {
						/*
						 * If current node's data is greater than index's node data, swap the data
						 * between them
						 */
	                    if (current.data > index.data) {
	                        temp = current.data;
	                        current.data = index.data;
	                        index.data = temp;
	                    }
	 
	                    index = index.next;
	                }
	                current = current.next;
	            }
	        }
	    }

	public static void main(String[] args) {
		
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
		llist.push_at(llist.searchNode(56), 30); // add element at particular position

		System.out.println("Created Linked Output is: ");
		llist.printList();
		llist.searchNode(30);
		llist.push_at(llist.searchNode(30), 40); // adding element after 30  UC7
		llist.printList();
		
		llist.sortList();						// Linkedlist after sorting
		System.out.println("\nLinkedlist after sorting ");
		llist.printList();
		
		llist.deleteNode(40);
		System.out.println("\nLinkedlist after removing an element ");
		llist.printList();
		llist.lengthOfLinkedList();  //list size of linkedlist
		
		llist.removeFirstNode();
		System.out.println("\nLinkedlist after first element removed");
		llist.printList();

		
		llist.removeLastNode();
		System.out.println("\nLinkedlist after Last element removed");
		llist.printList();
		llist.lengthOfLinkedList();

		
	}
}
