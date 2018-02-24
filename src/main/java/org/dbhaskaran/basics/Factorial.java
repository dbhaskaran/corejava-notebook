package org.dbhaskaran.basics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		
		System.out.println("Factorial "+ num + " = " + fact(num));

	}

	private static int fact(int num) {
		if(num == 0) {
			return 1;
		}
		else {
			return num * fact(num-1);
		}
	}

}
