package com.id;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcConnection6 {

	public static void main(String[] args) {
	
		
		Connection con=null;
		ResultSet rs=null;
		PreparedStatement ptmt;
		
		
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			
			String query="insert into student(id,name, dept, salary) values(?,?,?,?)";
			ptmt=con.prepareStatement(query);
			
			
			ptmt.setString(1,"hi" );
			ptmt.setString(2,"hi" );
			ptmt.setString(3,"hi" );
			
			ptmt.executeUpdate();
			rs=ptmt.getGeneratedKeys();
			while(rs.next())
			{
			
				System.out.println("Generated Emp Id: "+rs.getInt(1));
            
			}
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
