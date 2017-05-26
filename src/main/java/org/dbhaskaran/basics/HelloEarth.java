package org.dbhaskaran.basics;

import java.util.Scanner;

public class HelloEarth {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your country :");
		String country = in.nextLine();
		HelloEarth.greet(country);
		in.close();

	}
	
	static void greet(String country) {
		if (country.equalsIgnoreCase("India")) {
			System.out.println("Namaste!");
		}
		else {
			System.out.println("Good Morning!");
		}
	}

}
