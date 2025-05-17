package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Users;
import models.UsersModels;
import views.Usersviews;

public class UsersController {
	
		private Usersviews vista;
		private List<Users> usuarios = new ArrayList<>();
		
		public UsersController() {
			
			vista = new Usersviews();
		}
		
		public void index() {
			
			UsersModels um = new UsersModels();
			
			usuarios = um.getAll();
			
			vista.index(usuarios);
			
		}

		public List<Users> getUsers() {
			// TODO Auto-generated method stub
			return null;
		}

		public boolean deleteUser(int id) {
			// TODO Auto-generated method stub
			return false;
		}
}