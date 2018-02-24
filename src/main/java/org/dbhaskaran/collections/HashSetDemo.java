package org.dbhaskaran.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<Integer>(); 
		h.add(1);
		h.add(3);
		h.add(2);
		h.add(3);
		h.add(4);
		Iterator<Integer> i = h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("Does HashSet contain 3: " + h.contains(3));
		h.remove(3);
		System.out.println("Does HashSet contain 3: " + h.contains(3));
		
		System.out.println("Size of HashSet: " + h.size());
		
	}

}
