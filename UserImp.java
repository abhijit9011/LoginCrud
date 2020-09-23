package com.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserImp implements UserDAO {

	static Connection connection;
	static PreparedStatement ps;
	
	@Override
	public int insertUser(User user) {
		int status=0;
		try {
			
			connection=DatabaseConnection.getConnection();
			ps=connection.prepareStatement("insert into user values(?,?,?,?)");
			
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getMobile());
			ps.setString(4, user.getUserPassword());
			status=ps.executeUpdate();
			connection.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		return status;
	}

	@Override
	public User getUser(String user_id, String pass) {
		User user= new User();
		try {
			connection=DatabaseConnection.getConnection();
			ps=connection.prepareStatement("select * from user where user_id=? and user_pass=?");
			
			ps.setString(1, user_id);
			ps.setString(2, pass);
			
			ResultSet rs =ps.executeQuery();
			
			while(rs.next()) {
				user.setUserName(rs.getString(1));
				user.setUserPassword(rs.getString(2));
				user.setUserName(rs.getString(3));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
