package models;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class UsersModels {
    private Connection conn;
    
    public UsersModels() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/servidor", "root", "root");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public boolean isConnected() {
        try {
            return conn != null && !conn.isClosed();
        } catch (SQLException e) {
            return false;
        }
    }
    
    public List<Users> getAll() {
    	
    	List<Users> usuarios = new ArrayList<>();
        String query = "SELECT * FROM users";
        
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            
            while (rs.next()) {
                usuarios.add(new Users(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getString("usuario"),
                    rs.getString("rol"),
                    rs.getString("telefono"),
                    rs.getString("create_at"),
                    rs.getString("update_at")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }
    
    public boolean remove(int id) {

		String query = "DELETE FROM users WHERE `users`.`id` =  "+ id;
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Model", "root", "root");
			stmt = conn.createStatement();

			stmt.executeUpdate(query);

			return true; 


		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {}
		}


		return false;

	}
    
public boolean insert(int id,String name, String email,String role,int phone) {
		
		String query = "INSERT INTO users (name, email, role, phone, create_at) " +
		"VALUES (' " + name + "', '"+ email + "','"+ role + "','" + phone +"', NOW())";
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/servidor", "root", "root");
			stmt = conn.prepareStatement(query);
			
			stmt.executeUpdate(query);
			
			return true; 
				
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {}
		}
		
		
		return false;
		
	}
}

