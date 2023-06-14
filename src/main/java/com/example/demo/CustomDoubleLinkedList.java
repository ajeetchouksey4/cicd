package com.example.demo;

import java.util.Scanner;

import org.antlr.v4.runtime.misc.NotNull;


public sealed class CustomDoubleLinkedList permits CustomLinkedList {

	static class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}

	}

	Node head = null;

	public void insert(int data) {
		Node new_node = new Node(data);
		Scanner scan = new Scanner(System.in);

		if (head == null) {
			System.out.println("Linkedlist is empty, we can create new....");
			head = new_node;
		} else {
			System.out.println("Enter 0 for insert at begin or 1 for end");
			int choice = scan.nextInt();

			switch (choice) {
			case 0: {
				new_node.prev = null;
				new_node.next = head;
				head = new_node;
				break;
			}
			case 1: {

				Node temp = head;

				while (temp.next != null) {
					temp = temp.next;
				}

				new_node.next = null;
				temp.next = new_node;

				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}
	}

	public void traverse() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		CustomDoubleLinkedList list = new CustomDoubleLinkedList();
		list.insert(10);
		list.insert(20);

		list.traverse();

		String s = null;
	
		
	}

}

@FunctionalInterface
interface Emp {
	private void print() {

	}

	private void p21rint() {

	}

	static private void printwd() {

	}

	void print1();
}