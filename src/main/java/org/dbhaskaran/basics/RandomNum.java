package org.dbhaskaran.basics;

import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int rand_int1 = rand.nextInt(100);
		int rand_int2 = rand.nextInt(100);
		
		System.out.println("The random number is: "+ rand_int1);
		System.out.println("The random number is: "+ rand_int2);
		
		double rand_dbl1 = rand.nextDouble();
		double rand_dbl2 = rand.nextDouble();
		
		System.out.println("The random double is: "+ rand_dbl1);
		System.out.println("The random double is: "+ rand_dbl2);
	}

}
