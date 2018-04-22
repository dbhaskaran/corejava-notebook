package org.dbhaskaran.ds;

public class StackFromLL {

	public static void main(String[] args) {
		Stack s1 = new Stack();
		System.out.println(s1.isEmpty());
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.push(5);
		System.out.println(s1.contains(3));
		System.out.println(s1.peek());
		s1.print();
		s1.pop();
		s1.print();

		// Using a stack to reverse a string or array
		int[] myArr = { 101, 102, 103, 104, 105 };
		Stack s2 = new Stack();
		for (int i : myArr) {
			s2.push(i);
		}

		for (int i = 0; i < myArr.length; i++)
			myArr[i] = s2.pop();

		for (int i : myArr) {
			System.out.println(i);
		}

		// TODO check for balanced parentheses

	}

}

class Item {

	int data;
	Item next;

	public Item(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Item getNext() {
		return next;
	}

	public void setNext(Item next) {
		this.next = next;
	}
}

class Stack {
	Item top;

	public Stack() {
		top = new Item(0);
		top.next = null;
	}

	// Push
	public boolean push(int data) {
		Item newItem = new Item(data);
		newItem.setNext(top.getNext());
		top.setNext(newItem);
		return true;
	}

	// Pop
	public int pop() {
		Item curr = top.getNext();
		if (curr == null)
			return -1;
		top.setNext(curr.getNext());
		return curr.getData();
	}

	// Peek
	public int peek() {
		if (top.getNext() == null)
			return -1;
		return top.getNext().getData();
	}

	// IsEmpty
	public boolean isEmpty() {
		if (top.getNext() == null)
			return true;
		else
			return false;
	}

	// Search
	public boolean contains(int data) {
		Item curr = top.getNext();
		while (curr != null) {
			if (curr.getData() == data)
				return true;
			curr = curr.getNext();
		}
		return false;
	}

	// Print
	public void print() {
		Item curr = top.getNext();
		System.out.println("Stack: ");
		while (curr != null) {
			System.out.println(curr.getData());
			curr = curr.getNext();
		}
	}
}
