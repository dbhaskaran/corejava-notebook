package org.dbhaskaran.basics;

public class MultTables {

	public static void main(String[] args) {
		int num = 5;

		for (int i = 1; i <= 10; i++) {
			int prod = num * i;
			System.out.println(num + " * " + i + " = " + prod);
		}

		int hrs = 24, min = 60, sec = 60;

		System.out.println("\nNumber of minutes in a day: " + hrs * min);
		System.out.println("Number of seconds in a day: " + hrs * min * sec);

	}

}
