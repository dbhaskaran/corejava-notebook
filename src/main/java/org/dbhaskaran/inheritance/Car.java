package org.dbhaskaran.inheritance;

public class Car extends Vehicle {

	public Car() {
		System.out.println("Initializing Car " + this.hashCode());
	}
	
	@Override
	public void whoami() {
		System.out.println("Car");
	}

	@Override
	public String fuel() {
		return "Petrol";
	}
}
