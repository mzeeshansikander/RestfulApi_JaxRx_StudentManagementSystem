package org.zeehan.restapi.messenger.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import org.zeehan.restapi.messenger.service.MessageService;
import org.zeeshan.restapi.messenger.model.Message;

@Path("/messages")
public class MessageResource {
	
	  
	
	
	
	
	MessageService messageService = new MessageService();
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	//public List<String> getMessages(){
	public String getMessages(){
		//System.out.println("Connection Success");
		
		//dbConnection db = new dbConnection();	
		
		

//		List<String> list = new ArrayList<>();
		//list.add(db.dbConnectiondo());
		
		
		return "Helloworld!";
		//return db.dbConnectiondo();
		//return messageService.getAllMessages();


		
		
	}

}
