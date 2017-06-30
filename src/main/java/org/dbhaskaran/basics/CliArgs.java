package org.dbhaskaran.basics;

public class CliArgs {

	public static void main(String[] args) {
		
		int lenght = args.length;
		
		if (lenght == 0) {
			System.out.println("No inputs!");
		}
		else {
			System.out.println("List of arguments!");
			for (String s : args){
				System.out.println(s);
			}
		}

	}

}
