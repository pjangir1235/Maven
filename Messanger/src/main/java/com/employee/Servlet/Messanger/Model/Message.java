package com.employee.Servlet.Messanger.Model;



import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Message 
{
	int id;
	String name;
	String created;
	String author;
	public Message()
	{
		
	}
	public Message(int id, String name, String created, String author) {
		super();
		this.id = id;
		this.name = name;
		this.created = created;
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
