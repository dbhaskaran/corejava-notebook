package org.dbhaskaran.interviews;

public class BinaryGap {

	public static void main(String[] args) {
		
		binGap(1041);

	}
	
	public static void binGap(int i) {
		int bin_digit;
		boolean start = false;
		int count = 0, lenght = 0;
		do {
			bin_digit = i % 2;
			if (bin_digit == 1 && start == false) {
				start = true;
				count++;
			}
			if (bin_digit == 1 && start == true){
				if(lenght > 0) {
					print(count, lenght);
					count ++;
					lenght = 0;
				}
			}
			if (bin_digit == 0 && start == true){
				lenght++;
			}
			if (bin_digit == 0 && start == false){
			}
			i = i/2;
		} while(i != 0);
	}
	
	public static void print(int count, int lenght) {
		System.out.println(String.format("The count is %d and lenght is %d", count, lenght));
	}

}
