package org.dbhaskaran.basics;

import java.util.Random;

public class TernaryOperator {

	public static void main(String[] args) {
		// testExpression ? true : false
		Random generator = new Random();
		int x = generator.nextInt(50), y= generator.nextInt(50);
		String result = (x>y)? "x is greater than y":"y is greater than x";
		System.out.println(result);
		
		x += 20;
		String result2 = (x>y)? "x is greater than y":"y is greater than x";
		System.out.println(result2);

	}

}
