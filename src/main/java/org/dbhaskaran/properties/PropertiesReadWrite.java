package org.dbhaskaran.properties;

import java.io.*;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesReadWrite {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		OutputStream output = null;
		InputStream input = null;
		

		try {
			
			output = new FileOutputStream("src/main/resources/config.properties");
			input = new FileInputStream("src/main/resources/config.properties");

			System.out.println("Setting properties");
			// set the properties value
			prop.setProperty("database", "localhost");
			prop.setProperty("dbuser", "test");
			prop.setProperty("dbpassword", "testpassword");
			prop.setProperty("appid", "e38e55e6ca3b3def7001cc57903dfa9b");
			
			System.out.println("Saving properties");
			// save properties to project root folder
			prop.store(output, null);
			System.out.println("Saved properties");
			// load a properties file
			prop.load(input);

			// get the property value and print it out
			System.out.println(prop.getProperty("database"));
			System.out.println(prop.getProperty("dbuser"));
			System.out.println(prop.getProperty("dbpassword"));
			
			System.out.println("Clearing properties");
			// set the properties value
			prop.remove("database");
			prop.remove("dbuser");
			prop.remove("dbpassword");
			prop.store(output, null);
			System.out.println("Saving properties");

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}

}
