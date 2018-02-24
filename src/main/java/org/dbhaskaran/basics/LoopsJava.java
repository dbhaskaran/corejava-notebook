package org.dbhaskaran.basics;

import java.util.Arrays;

public class LoopsJava {

	public static void main(String[] args) {
		
		String[] fruits = {"Apple", "Banana", "Mango", "Pineapple"};
		String[] fruits1 = {"Apple", "Banana", "Mango", "Pineapple"};
		
		System.out.println(Arrays.equals(fruits, fruits1) );
		System.out.println(fruits[0].equals(fruits1[0]));
		
		System.out.println("Demo of FOR loop");
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("Demo of ENHANCED FOR loop");
		
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
		
		System.out.println("Demo of WHILE loop");
		
		int i = 1;
		while(i < 5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("Demo of Do-WHILE loop");
		
		do {
			System.out.println(i);
			i--;
		} while(i > 0);

	}

}
