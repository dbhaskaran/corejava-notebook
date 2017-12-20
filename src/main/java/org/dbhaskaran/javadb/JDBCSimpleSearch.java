package org.dbhaskaran.javadb;

import java.sql.*;
import java.util.Scanner;

public class JDBCSimpleSearch {

	private static Connection connection = null;
	private static PreparedStatement statement = null;
	private static ResultSet resultSet = null;
	private static Scanner in = null;

	public static void main(String[] args) throws SQLException {
		try {
			in = new Scanner(System.in);
			System.out.println("Please enter a order item:");
			String orderitem = in.nextLine();
			String query = "SELECT * FROM Orders WHERE Item = ?";
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant?"
					+ "autoReconnect=true&useSSL=false&user=root&password=tiger");
			statement = connection.prepareStatement(query);
			statement.setString(1, orderitem);
			resultSet = statement.executeQuery();
			if (!resultSet.next()) {
				System.out.printf("No customer ordered %s", orderitem);
			}
			while (resultSet.next()) {
				String fname = resultSet.getString("FirstName");
				String lname = resultSet.getString("LastName");
				String item = resultSet.getString("Item");

				System.out.println("Customer Name: " + fname + " " + lname);
				System.out.println("Customer Order: " + item);

			}

		} catch (SQLException sqe) {
			sqe.printStackTrace();
		} finally {
			try {
				in.close();
				resultSet.close();
				statement.close();
				connection.close();
			} catch (Exception e) {
			}
		}

	}
}
