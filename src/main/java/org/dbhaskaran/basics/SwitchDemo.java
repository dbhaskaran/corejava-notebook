package org.dbhaskaran.basics;

import java.util.Random;

public class SwitchDemo {

	public static void main(String[] args) {
		
		Random gen = new Random();
		int i = gen.nextInt(10);
		
		switch(i) {
		
		case 3:
			System.out.println(String.format("Luck number %s! Jackpot!", i));
			break;
		case 2:
			System.out.println(String.format("Luck number %s! Jackpot!", i));
			break;
		case 5:
			System.out.println(String.format("Luck number %s! Jackpot!", i));
			break;
		case 7:
			System.out.println(String.format("Luck number %s! Jackpot!", i));
			break;
		default:
			System.out.println(String.format("Number %s! Better Luck!", i));
		}

}

}
