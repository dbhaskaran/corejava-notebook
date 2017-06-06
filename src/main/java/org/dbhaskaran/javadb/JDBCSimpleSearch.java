package org.dbhaskaran.javadb;

import java.sql.*;
import java.util.Scanner;

public class JDBCSimpleSearch {

	private static Connection connection = null;
	private static PreparedStatement statement = null;
	private static ResultSet resultSet = null;

	public static void main(String[] args) throws SQLException {
		try {
			Scanner in = new Scanner(System.in);
			System.out.println("Please enter a order item:");
			String orderitem = in.nextLine();
			String query = "SELECT * FROM Orders WHERE Flavor = ?";
			connection = DriverManager.getConnection("jdbc:mysql://172.17.0.3:3306/benjerry?"
					+ "autoReconnect=true&useSSL=false&user=root&password=tiger");
			statement = connection.prepareStatement(query);
			statement.setString(1, orderitem);
			resultSet = statement.executeQuery();
			if (!resultSet.next()) {
				System.out.printf("No customer ordered %s", orderitem);
			}
			while (resultSet.next()) {
				String Fname = resultSet.getString("FirstName");
				String Lname = resultSet.getString("LastName");
				String Flavor = resultSet.getString("Flavor");

				System.out.println("Customer Name: " + Fname + " " + Lname);
				System.out.println("Customer Order: " + Flavor);

			}

		} catch (SQLException sqe) {
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
