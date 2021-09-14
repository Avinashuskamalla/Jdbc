package com.id;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcConnection3 {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");

			stmt = con.createStatement();

			Boolean bool = stmt.execute(Query.sql4);

			if (bool) {

				rs = stmt.getResultSet();

				while (rs.next()) {
					System.out.println(rs.getString(1));
				}

			} else {
				int count = stmt.getUpdateCount();
				System.out.println("Total records updated: " + count);
			}

		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
			if (stmt != null)
				stmt.close();
			if (con != null)
				con.close();
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

}