package com.healthcare.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	private static String userName= "root";
	private static String password = "Yash7007";
	private static Connection connection;
	private static String url= "jdbc:mysql://localhost:3306/iacsd_25";	
	
	
	public static Connection openConnection()throws  SQLException
	{
		connection = DriverManager.getConnection(url, userName, password);
		return connection;
	}
	
	public static void closeConnection()throws SQLException
	{
		if(connection != null)
		{
			connection.close();
		}
	}
	
}
