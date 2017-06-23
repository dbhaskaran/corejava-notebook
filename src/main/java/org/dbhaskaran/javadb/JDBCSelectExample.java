package org.dbhaskaran.javadb;

import java.sql.*;

public class JDBCSelectExample {

	private static Connection connection = null;
	private static Statement statement = null;
	private static ResultSet resultSet = null;

	public static void main(String args[]) throws Exception {

		try {

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts?"
					+ "autoReconnect=true&useSSL=false&user=root&password=tiger");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM addressbook;");

			while (resultSet.next()) {
				String Fname = resultSet.getString("first_name");
				String Lname = resultSet.getString("last_name");
				//String Flavor = resultSet.getString("Flavor");

				System.out.println("Customer Name: " + Fname + " " + Lname);
				//System.out.println("Customer Order: " + Flavor);

			}

		} catch (Exception sqe) {
			sqe.printStackTrace();
		} finally {
			try {
				resultSet.close();
				statement.close();
				connection.close();
			} catch (Exception e) {
			}
		}
	}

}
