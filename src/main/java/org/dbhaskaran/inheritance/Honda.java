package org.dbhaskaran.inheritance;

public class Honda extends Car {

	public Honda() {
		System.out.println("Initializing Honda");
	}

	@Override
	public void whoami() {
		System.out.println("Honda");
	}
	@Override
	public String fuel() {
		return "Gas";
	}
}
