package com.id;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection2 {

	public static void main(String[] args) {

		Connection con = null;
		
		Statement stmt = null;
		
		int count;

		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");

			stmt = con.createStatement();

			count = stmt.executeUpdate(Query.sql1);
			
			System.out.println("Updated Queries:" + count);
			
			count=stmt.executeUpdate(Query.sql2);
			
			System.out.println("Updated Queries:" + count);
			
			count=stmt.executeUpdate(Query.sql3);
			
			System.out.println("Updated Queries:" + count);
  
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();

		}
		
		finally {
			try {
				
				if(stmt!=null) stmt.close();
				
				if(con!=null)  con.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		

	}
}
