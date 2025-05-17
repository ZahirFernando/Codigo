package models;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ConnnectionModel {

	public ConnnectionModel() {
		String query = "select * from users";
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/servidor", "root", "root");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				
				Integer id = rs.getInt(1);
				String name = rs.getString(2);				
				//Date dob = rs.getDate(4);
				
				System.out.println("empId:" + id);
				System.out.println("firstName:" + name);
				 
				System.out.println("");
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {}
		}
	}

}

