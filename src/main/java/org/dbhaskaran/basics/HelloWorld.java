package org.dbhaskaran.basics;

public class HelloWorld {
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		HelloWorld.greet();
	}
	
	static {
		System.out.println("Welcome!");
	}
	static {
		System.out.println("Welcome Again!");
		HelloWorld.greet();
	}
	
	static void greet() {
		System.out.println("Hello from the Greet method");
	}
}
