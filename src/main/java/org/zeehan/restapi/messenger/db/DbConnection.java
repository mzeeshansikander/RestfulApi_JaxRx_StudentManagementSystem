package org.zeehan.restapi.messenger.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.zeeshan.restapi.messenger.model.Message;

import java.util.ArrayList;



public class DbConnection {
	 private static final String url = "jdbc:mysql://localhost:3306/messenger";
	    //private static final String url = "jdbc:mysql://localhost:3306/qareeb?zeroDateTimeBehavior=convertToNull";
	    private static final String userName = "root";
	    private static final String password = "";
	    private Connection connection = null;
	    List<String> list = new ArrayList<>();
	    
	    public DbConnection(){
	        try{
	            Class.forName("com.mysql.jdbc.Driver");
	            connection = DriverManager.getConnection(url,userName,password);
	            System.out.println("Connection Success");
	            
	            String query = "SELECT * FROM user";
	            Statement stmt = connection.createStatement();
	            ResultSet rs = stmt.executeQuery(query);
	            while(rs.next()) {
	           // 	System.out.println(rs.getString("name"));
	            		            	
	            }
	        } catch(ClassNotFoundException | SQLException e) {
	          
	            e.printStackTrace();
	        }
	    }
	    
	    public ResultSet runSql(String sql) throws SQLException{
	        Statement sta = connection.createStatement();
	        //PreparedStatement sta = connection.prepareStatement(sql);
	    	return sta.executeQuery(sql);
	    }
	    public void close() throws SQLException{
	        connection.close();
	    }

	}
