package com.id;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcConnection4 {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement stmt = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");

			stmt = con.prepareStatement(Query.sql5);
			stmt.setString(1, "rani");
			stmt.setInt(2, 23);
			int count = stmt.executeUpdate();
			System.out.println(count);

			stmt.setString(1, "amit");
			stmt.setInt(2, 55);
			count = stmt.executeUpdate();
			System.out.println(count);
			

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		
		finally {
			
			try {
				
				if (stmt!=null) {
					stmt.close();
				}
				
				if (con!=null) {
					con.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}

}
