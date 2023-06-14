package com.example.demo;

import java.util.Scanner;

public class NewLinkedList {

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head = null;

	public void insertNode(int data) {
		Node new_node = new Node(data);
		if (head == null) {
			System.out.println("linlkedlist is null, inserting value");
			head = new_node;
			return;

		}

		System.out.println("Enter 0 to insert at begin and 1 to end or any custom index no. type 2");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();

		switch (choice) {
		case 0: {

			new_node.next = head;
			head = new_node;
			break;
		}
		case 1: {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = new_node;

			break;
		}
		case 2: {
			int len = linkedListLength();
			System.out.println("Enter index no from 0 to " + (linkedListLength() - 1));

			int index = scan.nextInt();

			if (index > (len - 1)) {
				System.out.println("Worng index no. please try again");
				System.exit(0);
			}
			Node temp = head;
			while (index != 0) {
				temp = temp.next;
				index--;
			}

			new_node.next = temp;
			temp.next = new_node;

			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}

	}

	public void traverse() {

		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

	public int linkedListLength() {
		int count = 0;
		Node temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}

		return count;

	}

	public static void main(String[] args) {
		NewLinkedList list = new NewLinkedList();
		list.insertNode(10);
		list.insertNode(20);
		list.insertNode(30);
		list.insertNode(40);
		list.insertNode(50);

		list.traverse();
	}
}
