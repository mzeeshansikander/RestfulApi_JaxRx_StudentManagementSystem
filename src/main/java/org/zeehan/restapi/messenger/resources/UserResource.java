package org.zeehan.restapi.messenger.resources;

import java.sql.SQLException;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.zeehan.restapi.messenger.db.UserDao;
import org.zeeshan.restapi.messenger.model.User;

@Path("users")
public class UserResource {
	  	@GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public List<User> getUserDetails() throws SQLException{
	    	UserDao userDao = new UserDao();
	        return userDao.getUserDetails();
	    }


}
