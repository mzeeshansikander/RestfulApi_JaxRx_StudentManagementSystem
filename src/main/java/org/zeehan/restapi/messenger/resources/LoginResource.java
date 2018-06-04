package org.zeehan.restapi.messenger.resources;

import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.zeehan.restapi.messenger.db.LoginDao;

@Path("login")
public class LoginResource {

	   @GET
	   @Produces(MediaType.TEXT_PLAIN)
	    public String doLogin(@QueryParam("name") String name, @QueryParam("password") String password) throws SQLException{
	       System.out.println("CHECK"); 
		   LoginDao loginDao = new LoginDao();
	        return loginDao.doLogin(name, password);
	    }
}
	