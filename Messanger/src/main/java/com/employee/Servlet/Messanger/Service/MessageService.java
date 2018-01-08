 package com.employee.Servlet.Messanger.Service;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import com.employee.Servlet.Messanger.Model.Message;
public class MessageService extends Message
{
	static List<Message> list=new ArrayList<>();
	public MessageService()
	{
	}
	public List<Message> getAllMessages()
	{
		return list;
	}
	public Message getMessageById(int id)
	{	
		for(Message msg:list)
		{
			if(msg.getId()==id)
				return msg;
		}
		return null;
	}
	public Message addNewMessage(Message message)
	{
		int id=list.size();
		message.setId(id);
		list.add(message);
		return message;
		
	}

}
