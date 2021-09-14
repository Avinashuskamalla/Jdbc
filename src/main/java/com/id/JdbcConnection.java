package com.id;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {

	
	public static void main(String[] args) {
		
		try {
			
	//		Class.forName("com.mysql.jdbc.Driver");
			
		Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		Statement stmt	=con.createStatement();
		System.out.println("DB Connection Created");
			
			
		}	
//		 catch (ClassNotFoundException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
}
