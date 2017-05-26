package org.dbhaskaran.basics;

import java.util.*;
import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calendar now = Calendar.getInstance();
		int hrs = (int) now.get(Calendar.HOUR_OF_DAY);
        System.out.println("Please enter your name:");
        String name = sc.nextLine();
        if (hrs > 4 && hrs < 12) {
        	System.out.printf("Good Morning %s!", name);
        }
        else if (hrs >= 12 && hrs < 17) {
        	System.out.printf("Good Afternoon %s!", name);
        }
        else if (hrs >= 17 && hrs < 24) {
        	System.out.printf("Good Evening %s!", name);
        }
        else {
        	System.out.printf("You must be crazy %s!", name);
        }
        
        sc.close();

	}

}
