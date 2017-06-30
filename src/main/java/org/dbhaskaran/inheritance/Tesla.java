package org.dbhaskaran.inheritance;

public class Tesla extends Car {

	public Tesla() {
		System.out.println("Initializing Tesla");
	}

	public void whoami() {
		System.out.println("Tesla");
	}

	public String fuel() {
		return "Electric";
	}
}
