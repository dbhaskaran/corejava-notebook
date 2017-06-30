package org.dbhaskaran.inheritance;

public class Vehicle {

	public Vehicle() {
		System.out.println("Initializing Vehicle");
	}

	public void whoami() {
		System.out.println("Vehicle");
	}

	public String fuel() {
		return "Oil";
	}

}
