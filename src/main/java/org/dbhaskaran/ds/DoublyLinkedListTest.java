package org.dbhaskaran.ds;

public class DoublyLinkedListTest {

	public static void main(String[] args) {
		DoublyLL dll = new DoublyLL();
		dll.insertHead(5);
		dll.insertHead(4);
		dll.insertHead(3);
		dll.insertHead(2);
		dll.insertHead(1);
		dll.printDLL();
		dll.insertTail(6);
		dll.printDLL();

	}

}

class Node {
	private int data;
	private Node prev, next;

	public Node(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}

class DoublyLL {
	Node head;

	public DoublyLL() {
		head = new Node(0);
		head.setNext(null);
		head.setPrev(null);
	}

	public boolean insertHead(int data) {
		Node curr = new Node(data);
		curr.setNext(head.getNext());
		curr.setPrev(head);
		head.setNext(curr);
		return true;
	}

	public boolean insertTail(int data) {
		Node n = new Node(data);
		Node curr = head;
		while (curr.getNext() != null) {
			curr = curr.getNext();
		}
		curr.setNext(n);
		n.setPrev(curr);
		n.setNext(null);
		return true;
	}

	public void printDLL() {
		Node curr = head;
		System.out.print("DoublyLL: ");
		while (curr != null) {
			System.out.println(curr.getData());
			curr = curr.getNext();
		}
	}
}