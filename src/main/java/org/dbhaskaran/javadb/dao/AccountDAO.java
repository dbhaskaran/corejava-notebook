package org.dbhaskaran.javadb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDAO {

	private static Connection connection = null;
	private static Statement statement = null;
	private static ResultSet resultSet = null;
	
	public static void main(String[] args) {
		try{
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "root", "tiger");
			statement = connection.createStatement();
			//Create
			int result = statement.executeUpdate("INSERT INTO account values (1, 'Smith','John',4000)");
			System.out.println("Number of rows created: "+ result); 
			//Retrieve
			resultSet = statement.executeQuery("select * from account");
			while(resultSet.next()){
				int accno = resultSet.getInt("accno");
				String lastname = resultSet.getString("lastname");
				String firstname = resultSet.getString("firstname");
				int bal = resultSet.getInt("bal");
				System.out.println("Account Number: "+ accno);
				System.out.println("Last Name: "+ lastname);
				System.out.println("First Name: "+ firstname);
				System.out.println("Balance: $"+ bal);
			}
			//Update
			result = statement.executeUpdate("UPDATE account SET bal = 4100 WHERE accno = 1");
			System.out.println("Number of rows updated: "+ result);
			//Delete
			result = statement.executeUpdate("DELETE from account WHERE accno = 1");
			System.out.println("Number of rows deleted: "+ result); 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				resultSet.close();
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
