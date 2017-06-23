package org.dbhaskaran.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> fruitBasket = new LinkedList<String>();
		fruitBasket.add("Apple");
		fruitBasket.add("Banana");
		fruitBasket.add("Cherry");
		fruitBasket.add("DragonFruit");
		fruitBasket.add("Fig");
		System.out.println(fruitBasket);
        System.out.println("Size of the linked list: "+ fruitBasket.size());
        System.out.println("Is LinkedList empty? "+ fruitBasket.isEmpty());
        System.out.println("Does LinkedList contains 'Apple'? "+ fruitBasket.contains("Apple"));
        System.out.println("Does LinkedList contains 'Elderberry'? "+ fruitBasket.contains("Elderberry"));
        fruitBasket.addFirst("Avocado");
        fruitBasket.addLast("Grape");
        
        Iterator<String> itr = fruitBasket.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        fruitBasket.add(5, "Elderberry");
        System.out.println(fruitBasket);
	}

}
