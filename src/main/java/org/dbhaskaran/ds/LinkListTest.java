package org.dbhaskaran.ds;

public class LinkListTest {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		list.printForward(list.getHead());
		list.printReverse(list.getHead());

		list.printList();
		list.reverseIter();
		list.printList();
		list.addFirst(20);

		list.delete(3);

		list.printList();

	}
}

class Link {
	private int data;
	private Link next;

	public Link(int data) {
		this.data = data;
		this.next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Link getNext() {
		return next;
	}

	public void setNext(Link next) {
		this.next = next;
	}

}

class LinkedList {

	private Link first;

	public LinkedList() {
		first = new Link(0);
	}

	public boolean add(int i) {
		Link newLink = new Link(i);
		Link curr = first;
		while (curr.getNext() != null) {
			curr = curr.getNext();
		}
		curr.setNext(newLink);
		return true;
	}

	// TODO insert at nth position
	// TODO delete at nth position
	// TODO reverse a LL using recursion

	public boolean delete(int i) {
		Link slow = first;
		Link fast = first.getNext();
		while (fast.getData() != i) {
			slow = fast;
			if (fast.getNext() != null)
				fast = fast.getNext();
			else
				return false;
		}
		slow.setNext(fast.getNext());
		fast.setNext(null);
		return true;
	}

	public boolean addFirst(int i) {
		Link newLink = new Link(i);
		newLink.setNext(first.getNext());
		first.setNext(newLink);
		return true;
	}

	public boolean reverseIter() {
		Link curr = first.getNext();
		Link prev = null;
		Link next = null;
		while (curr != null) {
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}
		first = new Link(0);
		first.setNext(prev);
		return true;
	}

	// Prints list data
	public void printList() {
		Link currentLink = first;
		System.out.print("List: ");
		while (currentLink != null) {
			System.out.println(currentLink.getData());
			currentLink = currentLink.getNext();
		}
		System.out.println("");
	}

	public void printReverse(Link first) {
		if (first == null)
			return;
		// print list of head node
		printReverse(first.getNext());
		// After everything else is printed
		System.out.println(first.getData() + " ");
	}

	public void printForward(Link first) {
		if (first == null)
			return;
		System.out.println(first.getData() + " ");
		printForward(first.getNext());
	}

	public Link getHead() {
		return this.first;
	}

}
