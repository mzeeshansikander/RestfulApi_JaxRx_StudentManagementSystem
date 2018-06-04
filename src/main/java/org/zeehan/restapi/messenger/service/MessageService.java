package org.zeehan.restapi.messenger.service;

import java.util.List;
import java.util.ArrayList;

import org.zeeshan.restapi.messenger.model.Message;

public class MessageService {
	
	public List<Message> getAllMessages(){
		
		Message m1 = new Message(1,"Hello","Zeeshan");
		Message m2 = new Message(1,"Hello","Zeeshan");
		
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
		
	}

}
