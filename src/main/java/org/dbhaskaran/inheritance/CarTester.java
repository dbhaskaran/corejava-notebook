package org.dbhaskaran.inheritance;

public class CarTester {

	public static void main(String[] args) {
		
		Tesla t1 = new Tesla();
		System.out.println(t1.fuel());
		
		Honda h1 = new Honda();
		System.out.println(h1.fuel());
	}

}
