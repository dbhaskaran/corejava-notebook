package org.dbhaskaran.basics;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		System.out.println("Enter a string:");
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		
		for(int i = str1.length()-1; i >= 0; i--) {
			System.out.print(str1.charAt(i));
		}

	}

}
