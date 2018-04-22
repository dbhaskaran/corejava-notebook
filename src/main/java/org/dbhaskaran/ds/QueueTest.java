package org.dbhaskaran.ds;

public class QueueTest {

	public static void main(String[] args) {
		Queue q1 = new Queue();
		System.out.println(q1.isEmpty());
		q1.enqueue(1);
		q1.enqueue(2);
		q1.enqueue(3);
		q1.enqueue(4);
		q1.enqueue(5);
		q1.print();
		System.out.println(q1.isEmpty());
		q1.dequeue();
		q1.print();
		System.out.println(q1.peek());

	}

}

class Queue {
	Item top;

	public Queue() {
		top = new Item(0);
		top.setNext(null);
	}

	public boolean enqueue(int i) {
		Item newItem = new Item(i);
		Item curr = top;
		while (curr.getNext() != null) {
			curr = curr.getNext();
		}
		newItem.setNext(null);
		curr.setNext(newItem);
		return true;
	}

	public int dequeue() {
		Item curr = top.getNext();
		if (curr != null) {
			top.setNext(curr.getNext());
			curr.setNext(null);
			return curr.getData();
		}
		return 0;
	}

	public int peek() {
		Item curr = top.getNext();
		if (curr != null) {
			return curr.getData();
		}
		return 0;
	}

	public boolean isEmpty() {
		Item curr = top.getNext();
		if (curr == null) {
			return true;
		}
		return false;
	}

	public void print() {
		Item curr = top.getNext();
		while (curr != null) {
			System.out.println(curr.getData());
			curr = curr.getNext();
		}
	}
}
