package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
	String url = "jdbc:mysql://localhost:3306/hibernateDemo";
	String username = "root";
	String sql = "select * from login where uname = ? and pass = ?";
	String password = "";
	public boolean check(String uname, String pass) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2, pass);
//			System.out.println(st);
//			System.out.println(uname);
//			System.out.println(pass);
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
//				System.out.println(true);
				return true;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
//			System.out.println('e');
		}
//		System.out.println('x');
		return false;
	}
}
