package org.dbhaskaran.inheritance;

public class Vehicle {

	public Vehicle() {
		System.out.println("Initializing Vehicle " + this.hashCode());
	}

	public void whoami() {
		System.out.println("Vehicle");
	}

	public String fuel() {
		return "Oil";
	}

}
