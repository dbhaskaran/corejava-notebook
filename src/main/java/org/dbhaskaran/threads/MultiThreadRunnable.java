package org.dbhaskaran.threads;

public class MultiThreadRunnable implements Runnable {

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

	public static void main(String[] args) throws InterruptedException {
		MultiThreadRunnable m1 = new MultiThreadRunnable();
		Thread t = new Thread(m1);
		t.start();
		
		for(int j=0; j<200; j++) {
			System.out.print("j: "+ j + "\t");
			Thread.sleep(500);
		}

	}

}
