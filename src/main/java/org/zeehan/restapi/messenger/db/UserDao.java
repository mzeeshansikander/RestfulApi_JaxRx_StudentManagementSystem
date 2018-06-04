package org.zeehan.restapi.messenger.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.zeeshan.restapi.messenger.model.User;

public class UserDao {

	
	public ArrayList<User> getUserDetails() throws SQLException{
		
		
		ArrayList<User> userData = new ArrayList<>();
		
		DbConnection db= new DbConnection();
		
		try {
		
			ResultSet rs = db.runSql("Select * from user");
		
			while(rs.next()) {
				User user = new User();
				user.setUser_id(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				userData.add(user);
				System.out.println(rs.getString("name"));
				
			}
		}
		catch(SQLException ex) {
			 Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
			
			
		}
		db.close();
		return userData;
		
	}
}
