package org.dbhaskaran.ds;

public class LinkListTest {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		list.printList();
		
		list.addFirst(20);
		
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
		while(curr.getNext() != null){
			curr = curr.getNext();
		}
		curr.setNext(newLink);
		return true;
	}
	
	public boolean addFirst(int i) {
		Link newLink = new Link(i);
		newLink.setNext(first.getNext());
		first.setNext(newLink);
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

}
