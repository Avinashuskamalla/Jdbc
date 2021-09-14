package com.id;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection1 {

	public static void main(String[] args) {

		try {

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			Statement stmt = con.createStatement();

			System.out.println("DB created");

			ResultSet rs = stmt.executeQuery(Query.sql);

			while (rs.next()) {

				// rs.getString("name");
				// rs.getInt("salary");
				System.out.println(rs.getString(1));
				System.out.println(rs.getInt(2));
			}

			con.close();

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
