package org.dbhaskaran.basics;

public class NonStaticMembersDemo {

	int x;
	public NonStaticMembersDemo() {
		System.out.println("Inside Constructor!");
	}
	
	{
		System.out.println("Inside non static block");
	}
	
	public static void main(String[] args){
		System.out.println("Inside main method");
		new NonStaticMembersDemo();
		new NonStaticMembersDemo();	
		new NonStaticMembersDemo();	
		}
	static {
		System.out.println("Inside static block");
	}

}
