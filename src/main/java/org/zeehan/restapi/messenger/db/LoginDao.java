package org.zeehan.restapi.messenger.db;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
    private String name;
    private String password;
    
    public LoginDao(){
        name = null;
        password = null;
    }
    public String doLogin(String name,String password)throws SQLException {
    	DbConnection db = new DbConnection(); 
    	
    	
    	try {
    		ResultSet rs = db.runSql("Select name,password from user");
    		while(rs.next()) {
    			System.out.println("CHECK DAO");
    			this.name = rs.getString("name");
    			this.password = rs.getString("password");
    			
    			if (this.name.equals(name) && (this.password.equals(password))) {
    				return "Login Successfull";
    			}
    			
    			
    			
    		}
    		
    		
    	}catch(SQLException e){
            e.printStackTrace();
        }
    	
    	db.close();
         return "login failed";
    	
    	
    }

}
