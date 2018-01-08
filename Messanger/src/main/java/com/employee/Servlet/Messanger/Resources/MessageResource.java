
package com.employee.Servlet.Messanger.Resources;

import java.util.*;

import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.employee.Servlet.Messanger.Service.MessageService;
import com.employee.Servlet.Messanger.Model.Message;

@Path("message")
public class MessageResource 
{
	MessageService messageservice=new MessageService();
			@GET
			@Produces({MediaType.APPLICATION_JSON})
			public List<Message> getMessage()
			{
				return messageservice.getAllMessages();
			}
			 
			@GET
			@Path("/{messageId}")
			@Produces({MediaType.APPLICATION_JSON})
			public Message getMessages(@PathParam("messageId") int id)
			{
				System.out.println("Enter Here");
				
				return messageservice.getMessageById(id);
			}
			
			@POST
			@Path("/add")
			@Produces({MediaType.APPLICATION_JSON})
			@Consumes({MediaType.APPLICATION_JSON})
			public Message addMessage(Message message)
			{
				return messageservice.addNewMessage(message);
			}
			
			
			
			
			
			

}
