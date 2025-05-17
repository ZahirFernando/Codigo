package models;


public class Users {
	
	public int id;
	private String name;
	private String email;
	private String username;
	private String role;
	private String phone;
	private String create_at;
	private String update_at;
	
public Users(int id, String name, String email, String username, String role, String phone,String create_at, String update_at) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.username = username;
		this.role = role;
		this.phone = phone;
		this.create_at = create_at;
		this.update_at = update_at;
		
		
	}
	
}