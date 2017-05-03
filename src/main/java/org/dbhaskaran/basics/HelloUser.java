package org.dbhaskaran.basics;

import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        while(sc.hasNext())
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d\n",s1,x);
        }
        System.out.println("================================");

	}

}
