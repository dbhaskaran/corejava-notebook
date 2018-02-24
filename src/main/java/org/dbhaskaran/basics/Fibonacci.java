package org.dbhaskaran.basics;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		
		System.out.println("Fibonacci "+ num + " = "+ fib(num));

	}

	private static int fib(int num) {
		if (num <= 1) {
			return num;
		}
		else {
			return (fib(num-1) + fib(num-2));
		}
	}

}
