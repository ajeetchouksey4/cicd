package com.example.demo;

import java.util.Scanner;

public final class CustomLinkedList extends CustomDoubleLinkedList{

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	Node head = null;

	public void insert(int val) {
		System.out.println("Where you want to insert");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 0 for beginning and 1 for end");
		int choice = scan.nextInt();
		switch (choice) {
		case 0: {
			// beginning
			Node new_node = new Node(val);
			if (head == null) {
				// linkedlist is empty
				head = new_node;
			} else {
				// some element is alredy present into linkedlist
				new_node.next = head;
				head = new_node;
			}
			
			break;
		}
		case 1: {
			Node new_node = new Node(val);

			if (head == null) {
				// linkedlist is empty
				head = new_node;
			} else {
				Node temp = head;
				while (temp.next != null) {
					temp = temp.next;
				}

				temp.next = new_node;
			}
			
			break;

		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}

	}

	public void traverser() {
		if (head == null) {
			System.out.println("LL does not exist!");
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;

			}
		}
	}

	public static void main(String[] args) {
		CustomLinkedList node = new CustomLinkedList();

		node.insert(10);
		node.insert(20);
		node.insert(30);
		node.insert(40);

		node.traverser();
	}
}
