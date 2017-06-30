package org.dbhaskaran.basics;

public class PrimitiveToObj {

	public static void main(String[] args) {
		int x = 100;
		System.out.println(x);
		Integer y = Integer.valueOf(x);
		System.out.println(y);
		int z = y.intValue();
		System.out.println(z);
		
		byte b = 101;
		System.out.println(b);
		String strByte = Byte.toString(b);
		System.out.println(strByte);
		byte a = Byte.parseByte(strByte);
		System.out.println(a);
		
		long l = 999;
		System.out.println(l);
		Long m = Long.valueOf(l);
		System.out.println(m);
		String strLong = m.toString();
		System.out.println(strLong);
		Long n = Long.valueOf(strLong);
		System.out.println(n);
		
		long o = 777;
		System.out.println(o);
		Long p = new Long(o);
		System.out.println(p);
		String s = "545";
		System.out.println(s);
		Long r = new Long(s);
		System.out.println(r);

	}

}
