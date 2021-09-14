package com.id;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcConnection5 {

	public static void main(String[] args) {

		Connection con = null;
		ResultSet rs = null;
		PreparedStatement ptmt = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");

			ptmt = con.prepareStatement(Query.sql6);

			ptmt.setInt(1, 55);

			rs = ptmt.executeQuery();

			while (rs.next()) {

				System.out.println("Name: " + rs.getString(1) + " Salary :" + rs.getInt(2));
			}

			rs.close();

			ptmt.setInt(1, 23);
			rs = ptmt.executeQuery();

			while (rs.next()) {
				System.out.println("Name: " + rs.getString(1) + " Salary :" + rs.getInt(2));
			}

		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {

				if (ptmt != null)
					ptmt.close();

				if (con != null)
					con.close();

			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
}
