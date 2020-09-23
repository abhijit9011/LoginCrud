package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	
	private static final String DRIVER="com.mysql.jdbc.Driver";  
	private static final String URL="jdbc:mysql://localhost:3306/loginregistrationcurd";
	private static final String USERNAME="root";
	private static final String PASSWORD="root";
	
	private static Connection connection=null;
	
	public static Connection getConnection() {
		if(connection==null) {
			try {
				
				Class.forName("DRIVER");
				
			connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
				
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		return connection;

	}
	

}


