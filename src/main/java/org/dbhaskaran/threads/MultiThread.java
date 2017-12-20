package org.dbhaskaran.threads;

public class MultiThread extends Thread{

	public static void main(String[] args) throws InterruptedException {
		MultiThread m1 = new MultiThread();
		m1.start();
		
		for(int j=0; j<200; j++) {
			System.out.print("j: "+ j + "\t");
			Thread.sleep(500);
		}
	}
	
	@Override
	public void run() {
		for(int i=0; i<200; i++) {
			System.out.print("i: "+ i + "\t");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Threaded Interrupted: " + e);
			}
		}
	}

}
