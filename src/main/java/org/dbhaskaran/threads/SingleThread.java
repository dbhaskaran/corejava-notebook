package org.dbhaskaran.threads;

public class SingleThread {

	public static void main(String[] args) {
		
		SingleThread s1 = new SingleThread();
		s1.printNumbers();
		
		for(int j=0; j<200; j++) {
			System.out.print("j: "+ j + "\t");
		}
		

	}
	
	public void printNumbers() {
		for(int i=0; i<200; i++) {
			System.out.print("i: "+ i + "\t");
		}
		System.out.println();
	}

}
