package org.dbhaskaran.basics;

public class DataTypesDemo {

	public static void main(String[] args) {
		byte a = -10;
		boolean b = false;
		char c = 'F';
		short d = 34;
		int x = 234;
		long l = -2456;
		float f = 3.146367f;
		double e = 12355.24;

		int i = 8;
		byte g = (byte) x;
		char ch = (char) i;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(x);
		System.out.println(l);
		System.out.println(f);
		System.out.println(e);
		System.out.println(g);
		System.out.println(ch);
		System.out.println(Integer.toBinaryString(i));

	}

}
