package org.dbhaskaran.javadb;

import java.sql.*;

public class JDBCSelectExample {

	private static Connection connection = null;
	private static Statement statement = null;
	private static ResultSet resultSet = null;

	public static void main(String args[]) throws Exception {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/benjerry?"
					+ "autoReconnect=true&useSSL=false&user=root&password=tiger");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM Orders");

			while (resultSet.next()) {
				String Fname = resultSet.getString("FirstName");
				String Lname = resultSet.getString("LastName");
				String Flavor = resultSet.getString("Flavor");

				System.out.println("Customer Name: " + Fname + " " + Lname);
				System.out.println("Customer Order: " + Flavor);

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
